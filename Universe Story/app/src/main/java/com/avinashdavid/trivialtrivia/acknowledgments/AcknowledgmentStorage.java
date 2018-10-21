package com.avinashdavid.trivialtrivia.acknowledgments;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by avinashdavid on 12/5/16.
 */

/**
 * This class provides the model for acknowledgments.
 * Each acknowledgment has been explicitly created. No constructor has been provided, choosing instead to create the acknowledgments on demand via a method call
 */
public class AcknowledgmentStorage {
    private static ArrayList<AcknowledgmentObject> sQuestionsAcknowledgmentObjects;
    private static ArrayList<AcknowledgmentObject> sImagesAcknowledgementObjects;

//    private AcknowledgmentStorage() {
//        if (sQuestionsAcknowledgmentObjects == null){
//            sQuestionsAcknowledgmentObjects = createQuestionAcknowledgmentArrayList();
//        }
//        if (sImagesAcknowledgementObjects == null){
//            sImagesAcknowledgementObjects = createImageAcknowledgementArrayList();
//        }
//    }

    //static factory method for content acknowledgments
    public static ArrayList<AcknowledgmentObject> getQuestionsAcknowledgmentObjects() {
        if (sQuestionsAcknowledgmentObjects == null){
            sQuestionsAcknowledgmentObjects = createQuestionAcknowledgmentArrayList();
        }
        return sQuestionsAcknowledgmentObjects;
    }

    //static factory method for image acknowledgments
    public static ArrayList<AcknowledgmentObject> getImagesAcknowledgementObjects() {
        if (sImagesAcknowledgementObjects == null){
            sImagesAcknowledgementObjects = createImageAcknowledgementArrayList();
        }
        return sImagesAcknowledgementObjects;
    }

    //method to explicitly add all content acknowledgments
    private static ArrayList<AcknowledgmentObject> createQuestionAcknowledgmentArrayList(){
        ArrayList<AcknowledgmentObject> returnList = new ArrayList<>();
        returnList.add(new AcknowledgmentObject("ChatBot", "http://m.me/1125538687485749/"));
        returnList.add(new AcknowledgmentObject("HubbleSite", "http://hubblesite.org/"));
        returnList.add(new AcknowledgmentObject("BlackHole information", "https://www.nasa.gov/audience/forstudents/k-4/stories/nasa-knows/what-is-a-black-hole-k4.html"));
        returnList.add(new AcknowledgmentObject("BlackHole wiki", "https://science.nasa.gov/astrophysics/focus-areas/black-holes"));
        returnList.add(new AcknowledgmentObject("planets information", "https://solarsystem.nasa.gov/planets/overview/t"));
        returnList.add(new AcknowledgmentObject("planets wiki", "https://en.wikipedia.org/wiki/Planet"));
        returnList.add(new AcknowledgmentObject("nebulas information", "https://spaceplace.nasa.gov/nebula/en/"));
        returnList.add(new AcknowledgmentObject("stars wiki", "https://en.wikipedia.org/wiki/Star "));
        returnList.add(new AcknowledgmentObject("galaxy information", "https://www.nationalgeographic.com/science/space/universe/galaxies/?user.testname=lazyloading:c"));
        returnList.add(new AcknowledgmentObject("galaxy wiki", "https://www.nationalgeographic.com/science/space/universe/galaxies/?user.testname=lazyloading:c"));
        return returnList;
    }

    //method to explicitly add all image acknowledgments
    private static ArrayList<AcknowledgmentObject> createImageAcknowledgementArrayList(){
        ArrayList<AcknowledgmentObject> returnList = new ArrayList<>();
        returnList.add(new AcknowledgmentObject("Vlad Marin on Iconfinder", "https://www.nasa.gov/"));
        return returnList;
    }
}
