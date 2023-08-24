package com.user.exception;

import org.springframework.http.HttpStatus;

import lombok.*;


public class ApiResponse {

		private String message;
		private boolean sucess;
		private HttpStatus status;
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public boolean isSucess() {
			return sucess;
		}
		public void setSucess(boolean sucess) {
			this.sucess = sucess;
		}
		public HttpStatus getStatus() {
			return status;
		}
		public void setStatus(HttpStatus status) {
			this.status = status;
		}
		
		
		
}
