import React, {useState} from 'react'
import { Form } from 'react-bootstrap';

function TodoForm() {
    const [input, setInputs] = useState('');

    const handleSubmit = e => {
        e.preventDefault();

        // I think fetch goes here, see below
        // https://www.geeksforgeeks.org/get-and-post-method-using-fetch-api/
    }
    return (
        <form onSubmit={handleSubmit}>
            <Form.Group controlId="taskForm.ControlInput1">
                <Form.Label>Task Title</Form.Label>
                <Form.Control value={input} type="text" placeholder="Title" id="title"></Form.Control>
            </Form.Group>

            <Form.Group controlId="taskForm.ControlInput2">
                <Form.Label>Task Description</Form.Label>
                <Form.Control value={input} type="text" placeholder="Description" id="description"></Form.Control>    
            </Form.Group>

            <Form.Group controlId="taskForm.ControlInput3">
                <Form.Label>Task Category</Form.Label>
                <Form.Control value={input} type="text" placeholder="Category" id="category"></Form.Control>
            </Form.Group>

            <Form.Group controlId="taskForm.ControlSelect1">
                <Form.Label>Task Urgency</Form.Label>
                <Form.Control as="select">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                </Form.Control>
            </Form.Group>


            <Form.Group controlId="taskForm.DateInput1">
                <Form.Label>Due Date</Form.Label>
                <input
                type="date"
                id="dueDate"
                name="due-date">
            </input>
            </Form.Group>

            <button className = "btn btn-success">Add Task</button>
        </form>
    )
}

export default TodoForm
