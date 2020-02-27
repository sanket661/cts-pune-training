package com.ArrayQues;



	class Test<T>
	{
		private T obj;
		public T get()
		{
			return obj;
		}
		public void set(T obj)
		{
			this.obj=obj;
		}
	}
	class GenericsExample
	{
		public static void main(String...args)
		{
			Test<Integer> t=new Test<>();
			t.set(5);
			int i=(int)t.get();
			System.out.println(i);
			Test<String> t1=new Test<>();
			t1.set("Hello");
			String s=(String)t1.get();
			System.out.println(s);
		}
	}
	

