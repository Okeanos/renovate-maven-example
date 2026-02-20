package com.nikolasgrottendieck.${{ values.projectName }};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ${{ values.springName }} {

	/**
	 * Init.
	 *
	 * @param args runtime arguments
	 */
	public static void main(final String[] args) {
		${{ values.springName }}.run(${{ values.springName }}.class, args);
	}
}
