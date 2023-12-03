var events = require('events');

var eventEmitter = new events.EventEmitter();

var connctHandler = function connected(s){
    console.log('its',s);
}

eventEmitter.on('data_received',function(name){
    console.log(name,'Understand Event-Driven');
});

eventEmitter.emit('data_received','PETER');

eventEmitter.on('connection',connctHandler);
eventEmitter.emit('connection','Simple Solution');

console.log('Program Ended');