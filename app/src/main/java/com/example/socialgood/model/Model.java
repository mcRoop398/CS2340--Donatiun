package com.example.socialgood.model;

/**
 * This model serves as the sole data access object for the controllers.
 */

@SuppressWarnings("ALL")
public class Model {
    private static Model instance = new Model();

    private Model() {
        super();
    }

    /**
     * Retrieve the singleton instance of the model.
     * @return the instance!
     */
    public static synchronized Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }
}
