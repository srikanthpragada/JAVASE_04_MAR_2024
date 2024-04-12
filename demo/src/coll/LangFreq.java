package coll;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class LangFreq {

	public static void main(String[] args) throws Exception {
		var lines = Files.readAllLines(Path.of("lang_usage.txt"));
		var langs = new TreeMap<String, Integer>();

		for (var lang : lines) {
			if (lang.strip().length() == 0) // blank line, so ignore
				continue;

			if (langs.containsKey(lang)) // lang is already in map, so increment count
				langs.put(lang, langs.get(lang) + 1);
			else
				langs.put(lang, 1); // lang not found, so add a new entry
		}

		for (var lang : langs.keySet())
			System.out.printf("%-20s   %2d\n", lang, langs.get(lang));

	}

}
