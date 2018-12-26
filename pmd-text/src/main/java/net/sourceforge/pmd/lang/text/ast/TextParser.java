/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.lang.text.ast;

import net.sourceforge.pmd.lang.ParserOptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class TextParser {
	protected final ParserOptions parserOptions;

	public TextParser(ParserOptions parserOptions) {
		this.parserOptions = parserOptions;
	}

	public TextNode parse(Reader reader) {
		BufferedReader br = new BufferedReader(reader);
		List<String> fileLines = new ArrayList<>();
		try {
			for (;;) {
				String line = null;
				line = br.readLine();
				if (line == null) {
					break;
				}
				fileLines.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new TextNode(fileLines);
	}

}
