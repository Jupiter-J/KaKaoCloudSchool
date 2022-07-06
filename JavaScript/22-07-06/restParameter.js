

function foo(param1, ...args)
{
    console.log(arguments);
    // [Arguments] { '0': 1, '1': 2, '2': 3, '3': 4, '4': 5 }
    console.log(args);
    return args.pop();   //[ 1, 2, 3, 4, 5 ]

} 

var result = foo(1,2,3,4,5);
console.log(result);
