package com.example.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.library.model.Book;
import com.example.library.repository.LibRepo;

@Controller
public class LibCont {
	
	@Autowired
	LibRepo librepo;
	
	@RequestMapping("index")
	public String index() {
		return "index.jsp";
	}
	
	  @RequestMapping("addBook")
	    public String addBook(Book book) {
	        librepo.save(book);
	        return "index.jsp";
	  }
	  
	    @RequestMapping("getBook")
	    public ModelAndView getBook(@RequestParam Long id) {
	        ModelAndView mv = new ModelAndView("display.jsp");
	        Book book = librepo.findById(id).orElse(new Book());
	        mv.addObject("book", book);
	        return mv;
	    }
	    
	    @RequestMapping("deleteBook")
	    public ModelAndView deleteBook(@RequestParam Long id) {
	        ModelAndView mv = new ModelAndView("delete.jsp");
	        Book book = librepo.findById(id).orElse(new Book());
	        if (book.getId() != null) {
	            librepo.deleteById(id);
	        }
	        mv.addObject("book", book);
	        return mv;
	    }
	    
	    @RequestMapping("updateBook")
	    public ModelAndView updateBook(Book book) {
	    	ModelAndView mv = new ModelAndView("update.jsp");
			book =  librepo.findById(book.getId()).orElse(new Book());
			mv.addObject(book);
			return mv;
	    }
	    
}