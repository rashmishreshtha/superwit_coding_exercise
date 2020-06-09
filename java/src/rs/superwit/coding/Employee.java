package rs.superwit.coding;


public class Employee {
	 //	Write a program by creating an 'Employee' class having the following methods and print the final salary.
//		1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
//		2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
//		3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
	//	
		public double salary;
		public int workhours;
		
		public void getinfo(double salary, int workhours) {
			this.salary = salary;
			this.workhours = workhours;
			AddSal();
			AddWork();
		}

		public void AddSal() {
			if (this.salary < 500) {
				this.salary = this.salary + 10;
			}

		}

		public void AddWork() {
			if (this.workhours > 6) {
				this.salary = this.salary + 5;
			}
		}
	}


