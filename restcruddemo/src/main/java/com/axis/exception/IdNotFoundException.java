package com.axis.exception;

public class IdNotFoundException extends RuntimeException{ 
	 /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private String msg;
		
		

		public IdNotFoundException(String string) {
			// TODO Auto-generated constructor stub
		}

		public String getMsg() {
		return msg;
	 }

		public void setMsg(String msg) {
			this.msg = msg;
		}
	}
