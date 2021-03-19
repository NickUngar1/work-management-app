import React, {useState} from 'react'

function TodoForm() {
    const [input, setInputs] = useState('');

    const handleSubmit = e => {
        e.preventDefault();
    }
    return (
        <form className = "todo-form" onSubmit = {handleSubmit}>
            <input 
            type="text" 
            placeholder="Add a Task" 
            value={input} 
            name="text" 
            className="todo-input"></input>
            <button className = "todo-button">Add Task</button>
        </form>
    )
}

export default TodoForm
