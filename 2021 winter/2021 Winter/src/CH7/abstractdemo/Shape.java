package CH7.abstractdemo;

public abstract class Shape {
		private int x,y;
		
		public void move(int x, int y) {
			this.x=x;
			this.y=y;
		}
		
		public abstract void draw();
		
		public void setXY(int x, int y) {
			this.x=x;
			this.y=y;
		}
		
			@Override
			public boolean equals(Object obj) {
			// TODO Auto-generated method stub
//			return super.equals(obj);
				Shape s = (Shape)obj;
				if(this.x==s.x && this.y==s.y)
					return true;
				
				return false;
		}

			@Override
			public String toString() {
				return "Shape [x=" + x + ", y=" + y + "]";
			}
			
}
