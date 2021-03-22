import React, {useState} from 'react'

function TodoForm(props) {
    const [input, setInput] = useState('');

    const handleChange = e => {
        setInput(e.target.value);
    };

    const handleSubmit = e => {
        e.preventDefault();
    }

}



function Login() {
const [input, setInput] = useState('')

    return (
        <div>
        <Form.Group controlId="taskForm.ControlInput1">
            <Form.Label>Enter Username</Form.Label>
            <Form.Control value={input} type="text" placeholder="username" id="username"></Form.Control>
        </Form.Group>
        <Form.Group controlId="taskForm.ControlInput1">
            <Form.Label>Enter Password</Form.Label>
            <Form.Control value={input} type="text" placeholder="password" id="password"></Form.Control>
        </Form.Group>

        <button className = "btn btn-success">Login</button>
        </div>
    )
}

export default Login
