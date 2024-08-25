/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function (init) {
    var count = init
    return {
        increment: function () {
            return ++init;
        },
        decrement: function () {
            return --init;
        },
        reset: function () {
            init = count;
            return init;
        }
    }
};