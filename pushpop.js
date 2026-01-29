let stack=[]
top=-1
function push(value){
    top=top+1
    stack[top]=value
}
function pop(){
    removed =stack[top]
    top=top-1
    return removed
}
push(4)
push(10)
push(20)
pop(20)
console.log(stack)
console.log(pop())