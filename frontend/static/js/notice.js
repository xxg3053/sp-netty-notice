function initSocket(option) {
    var websocket = new ReconnectingWebSocket("ws://localhost:8888/websocket");
    //连接发生错误的回调方法
    websocket.onerror = function () {
        console.log("websocket.error");
    };
    //连接成功建立的回调方法
    websocket.onopen = function (event) {
        console.log("onopen");
        var param = {
            id: 1,
            name: 'kenfo',
            act: "produceNewUser",
            msg: ""
        }
        websocket.send(JSON.stringify(param));
    }

    //接收到消息的回调方法
    websocket.onmessage = function (event) {
        console.log(event.data);
    }

    //连接关闭的回调方法
    websocket.onclose = function () {
        websocket.close();
        console.log("websocket.onclose");
    }

    //监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
    window.onbeforeunload = function () {
        websocket.close();
    }
    return websocket;
}

$(function () {

    var socket = initSocket();
});

