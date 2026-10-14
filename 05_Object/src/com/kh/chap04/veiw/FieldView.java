package com.kh.chap04.veiw;

import com.kh.chap04.controller.FieldController;

public class FieldView {
	
	public FieldView() {
		
	}

	public void check() {
		
		FieldController fc = new FieldController();
		
		fc.checkVariable(10);
		
		System.out.println(fc.global);
		fc = null;
		//System.out.println(fc.global);
		
		System.out.println(FieldController.str);
	}
}
