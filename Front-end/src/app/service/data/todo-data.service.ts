import { HttpClient, HttpHeaders} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Todo } from 'src/app/list-todos/list-todos.component';

@Injectable({
  providedIn: 'root'
})
export class TodoDataService {

  constructor(private http:HttpClient) { }

  retrieveAllTodos(username: any){
    return this.http.get<Todo[]>(`http://localhost:8080/users/${username}/todos`);
    //console.log('executeHelloWorldBeanService');
  
  }

  deleteTodo(username: any, id: any){
    
    return this.http.delete(`http://localhost:8080/users/${username}/todos/${id}`);
  }
}


