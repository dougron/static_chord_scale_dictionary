package main.java.com.dougron.static_chord_scale_dictionary.chord_analysis;

import java.util.ArrayList;

/*
 * asimilar to the ChordAnalysisObject, but using the StaticChordScaleDictionary
 * as its repository of knowledge. Partners with a ScaleAnalysis class....
 * as canbe seen this was never completed, its role taken by the DataObjects.ChordChunk
 */
public class ChordAnalysis {
	
	private ArrayList<Integer> originalList;

	public ChordAnalysis(ArrayList<Integer> noteList){
		this.originalList = noteList;
		
	}
}
