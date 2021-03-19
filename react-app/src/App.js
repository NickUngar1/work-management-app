import './App.css';
import TodoForm from './components/TodoForm';
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  return (
    <div className="todo-app">
      <h1>Task Management</h1>
      <TodoForm />
    </div>
  );
}

export default App;
