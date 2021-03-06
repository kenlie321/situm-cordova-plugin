package es.situm.plugin.locationStatus;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.net.URL;

import es.situm.sdk.location.LocationStatus;

public class LocationStatusCreator {

    private final ClassLoader classLoader = getClass().getClassLoader();
    private final JSONParser parser = new JSONParser();

    public LocationStatus createLocationStatusStarting() {
        return LocationStatus.STARTING;
    }

    public LocationStatus createLocationStatusBLENotAvailable() {
        return LocationStatus.BLE_NOT_AVAILABLE;
    }

    public LocationStatus createLocationStatusCalculating() {
        return LocationStatus.CALCULATING;
    }

    public LocationStatus createLocationStatusCompassCalibrationNeeded() {
        return LocationStatus.COMPASS_CALIBRATION_NEEDED;
    }

    public LocationStatus createLocationStatusCompassCalibrationNotNeeded() {
        return LocationStatus.COMPASS_CALIBRATION_NOT_NEEDED;
    }

    public LocationStatus createLocationStatusNoConnection() {
        return LocationStatus.NO_CONNECTION;
    }

    public LocationStatus createLocationStatusPreparingPositioningModel() {
        return LocationStatus.PREPARING_POSITIONING_MODEL;
    }

    public LocationStatus createLocationStatusProcessingPositioningModel() {
        return LocationStatus.PROCESSING_POSITIONING_MODEL;
    }

    public LocationStatus createLocationStatusRetryDownloadPositioningModel() {
        return LocationStatus.RETRY_DOWNLOAD_POSITIONING_MODEL;
    }

    public LocationStatus createLocationStatusStartDownloadPositioningModel() {
        return LocationStatus.START_DOWNLOADING_POSITIONING_MODEL;
    }

    public LocationStatus createLocationStatusStartingPositioning() {
        return LocationStatus.STARTING_POSITIONING;
    }

    public LocationStatus createLocationStatusTimeSettingsManual() {
        return LocationStatus.TIME_SETTINGS_MANUAL;
    }

    public LocationStatus createLocationStatusUserNotInBuilding() {
        return LocationStatus.USER_NOT_IN_BUILDING;
    }

    public JSONObject getLocationStatus1(){
        try{
            URL resource = classLoader.getResource("locationStatus/locationStatus1.json");
            File file = new File(resource.getFile());
            return new JSONObject(parser.parse(new FileReader(file)).toString());
        }catch(Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public JSONObject getLocationStatus2(){
        try{
            URL resource = classLoader.getResource("locationStatus/locationStatus2.json");
            File file = new File(resource.getFile());
            return new JSONObject(parser.parse(new FileReader(file)).toString());
        }catch(Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public JSONObject getLocationStatus3(){
        try{
            URL resource = classLoader.getResource("locationStatus/locationStatus3.json");
            File file = new File(resource.getFile());
            return new JSONObject(parser.parse(new FileReader(file)).toString());
        }catch(Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public JSONObject getLocationStatus4(){
        try{
            URL resource = classLoader.getResource("locationStatus/locationStatus4.json");
            File file = new File(resource.getFile());
            return new JSONObject(parser.parse(new FileReader(file)).toString());
        }catch(Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public JSONObject getLocationStatus5(){
        try{
            URL resource = classLoader.getResource("locationStatus/locationStatus5.json");
            File file = new File(resource.getFile());
            return new JSONObject(parser.parse(new FileReader(file)).toString());
        }catch(Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public JSONObject getLocationStatus6(){
        try{
            URL resource = classLoader.getResource("locationStatus/locationStatus6.json");
            File file = new File(resource.getFile());
            return new JSONObject(parser.parse(new FileReader(file)).toString());
        }catch(Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public JSONObject getLocationStatus7(){
        try{
            URL resource = classLoader.getResource("locationStatus/locationStatus7.json");
            File file = new File(resource.getFile());
            return new JSONObject(parser.parse(new FileReader(file)).toString());
        }catch(Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public JSONObject getLocationStatus8(){
        try{
            URL resource = classLoader.getResource("locationStatus/locationStatus8.json");
            File file = new File(resource.getFile());
            return new JSONObject(parser.parse(new FileReader(file)).toString());
        }catch(Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public JSONObject getLocationStatus9(){
        try{
            URL resource = classLoader.getResource("locationStatus/locationStatus9.json");
            File file = new File(resource.getFile());
            return new JSONObject(parser.parse(new FileReader(file)).toString());
        }catch(Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public JSONObject getLocationStatus10(){
        try{
            URL resource = classLoader.getResource("locationStatus/locationStatus10.json");
            File file = new File(resource.getFile());
            return new JSONObject(parser.parse(new FileReader(file)).toString());
        }catch(Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public JSONObject getLocationStatus11(){
        try{
            URL resource = classLoader.getResource("locationStatus/locationStatus11.json");
            File file = new File(resource.getFile());
            return new JSONObject(parser.parse(new FileReader(file)).toString());
        }catch(Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public JSONObject getLocationStatus12(){
        try{
            URL resource = classLoader.getResource("locationStatus/locationStatus12.json");
            File file = new File(resource.getFile());
            return new JSONObject(parser.parse(new FileReader(file)).toString());
        }catch(Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public JSONObject getLocationStatus13(){
        try{
            URL resource = classLoader.getResource("locationStatus/locationStatus13.json");
            File file = new File(resource.getFile());
            return new JSONObject(parser.parse(new FileReader(file)).toString());
        }catch(Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }
}
