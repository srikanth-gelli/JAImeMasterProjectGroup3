package com.example.jaimegroup3.mqttmanager

import android.content.ClipData
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.jaimegroup3.R
import com.example.jaimegroup3.UIUpdaterInterface

open class Moving : AppCompatActivity(), UIUpdaterInterface {

    var mqttManager: MQTTManager? = null

    override fun resetUIWithConnection(status: Boolean) {
        // ipAddressField.isEnabled  = !status
        // topicField.isEnabled      = !status
        // messageField.isEnabled    = status
        // connectBtn.isEnabled      = !status
        //sendBtn.isEnabled = status
        //POI_1.isEnabled = status
        // Update the status label.
        if (status) {
            updateStatusViewWith("Connected")
        } else {
            updateStatusViewWith("Disconnected")
        }
    }

    override fun updateStatusViewWith(status: String) {
        //statusLabl.text = status
    }

    override fun update(message: String) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContentView(R.layout.activity_main)*/

        // Enable send button and message textfield only after connection
        resetUIWithConnection(false)
    }

    var hostname = "broker.mqttdashboard.com"
    var host = "tcp://" + hostname + ":1883"
    var poiTopic = "zbos/slam/poi/moveto/uuid" //POI
    var messageTopic = "zbos/dialog/set/message" //message
    var dummyTopic = "topic/dummyTopic"
    var chargingTopic = "zbos/slam/charging/goto" //charging station

    fun connect(view: View) {
        var connectionParams = MQTTConnectionParams("MQTTSample", host, chargingTopic, "", "")
        mqttManager = MQTTManager(connectionParams, applicationContext, this)
        mqttManager?.connect()
    }

    fun sendMessage(view: View) {
        //mqttManager.subscribe(dummyTopic)
        mqttManager?.publish("Hello World..!")
    }

    fun POI1(view: View) {
        mqttManager?.subscribe(poiTopic)
        mqttManager?.publish(
            "{\n" +
                    "\"mapName\": \"Master Project\",\n" +
                    "\"uuid\": \"b9708cf2-c950-4443-8c8b-952bbb706f56\",\n" +
                    "\"speed\": 50\n" +
                    "}"
        )
    }

    fun POI2(view: View) {
        mqttManager?.subscribe(poiTopic)
        mqttManager?.publish(
            "{\n" +
                    "\"mapName\": \"Master Project\",\n" +
                    "\"uuid\": \"000d96f5-860c-4b7e-bde3-ea18ab87cb67\",\n" +
                    "\"speed\": 50\n" +
                    "}"
        )
    }

    fun POI3(view: View) {
        mqttManager?.subscribe(poiTopic)
        mqttManager?.publish(
            "{\n" +
                    "\"mapName\": \"Master Project\",\n" +
                    "\"uuid\": \"c8d30b11-cfe4-4206-8c07-7a46a1ed5c35\",\n" +
                    "\"speed\": 50\n" +
                    "}"
        )
    }

    fun POI4(view: View) {
        mqttManager?.subscribe(poiTopic)
        mqttManager?.publish(
            "{\n" +
                    "\"mapName\": \"Master Project\",\n" +
                    "\"uuid\": \"c73e4861-49d8-465b-b82f-3808651044df\",\n" +
                    "\"speed\": 50\n" +
                    "}"
        )
    }

    fun POI5(view: View) {
        mqttManager?.subscribe(poiTopic)
        mqttManager?.publish(
            "{\n" +
                    "\"mapName\": \"Master Project\",\n" +
                    "\"uuid\": \"56369520-80d7-4e37-9d1b-ed00506be3fe\",\n" +
                    "\"speed\": 50\n" +
                    "}"
        )
    }

    fun POI6(view: View) {
        mqttManager?.subscribe(poiTopic)
        mqttManager?.publish(
            "{\n" +
                    "\"mapName\": \"Master Project\",\n" +
                    "\"uuid\": \"1e9e8d64-a671-40b6-8633-8a85ce9ce372\",\n" +
                    "\"speed\": 50\n" +
                    "}"
        )
    }

    fun POI7(view: View) {
        mqttManager?.subscribe(poiTopic)
        mqttManager?.publish(
            "{\n" +
                    "\"mapName\": \"Master Project\",\n" +
                    "\"uuid\": \"f63489f3-07f4-490b-bb36-41cd87f8634a\",\n" +
                    "\"speed\": 50\n" +
                    "}"
        )
    }

    fun POI8(view: View) {
        mqttManager?.subscribe(poiTopic)
        mqttManager?.publish(
            "{\n" +
                    "\"mapName\": \"Master Project\",\n" +
                    "\"uuid\": \"43ab4c93-b2a6-4845-a1cf-6fec9e8b1dac\",\n" +
                    "\"speed\": 50\n" +
                    "}"
        )
    }

    fun chargingStation(view: View) {
        mqttManager?.subscribe(chargingTopic)
        mqttManager?.publish(
            "{\n" +
                    "\"mapName\": \"Master Project\",\n" +
                    "\"uuid\": \"2b2c9353-d851-452a-9091-46749ad216d1\",\n" +
                    "\"speed\": 50\n" +
                    "}"
        )
    }

}