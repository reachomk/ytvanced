package com.google.vr.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.util.Log;
import defpackage.baei;

public class DeviceInfo {
    public final long a;
    private final Context b;
    private final BroadcastReceiver c = new baei(this);

    private DeviceInfo(long j, Context context) {
        this.a = j;
        this.b = context;
    }

    public native void nativeUpdateHeadphoneStateChange(long j, int i);

    private static DeviceInfo createDeviceInfo(long j, Context context) {
        return new DeviceInfo(j, context);
    }

    private void registerHandlers() {
        this.b.registerReceiver(this.c, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    private void unregisterHandlers() {
        this.b.unregisterReceiver(this.c);
    }

    private boolean isHeadphonePluggedIn() {
        if (VERSION.SDK_INT < 23) {
            return true;
        }
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) this.b.getSystemService("audio")).getDevices(2)) {
            if (audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 22) {
                return true;
            }
        }
        return false;
    }

    private int getSystemSampleRate() {
        String property = ((AudioManager) this.b.getSystemService("audio")).getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property != null) {
            return Integer.parseInt(property);
        }
        Log.w("DeviceInfo", "Could not obtain system sample rate, defaulting to 48000");
        return 48000;
    }

    private int getSystemBufferSize() {
        String property = ((AudioManager) this.b.getSystemService("audio")).getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property != null) {
            return Integer.parseInt(property);
        }
        Log.w("DeviceInfo", "Could not obtain system buffer size, defaulting to 256");
        return 256;
    }

    private boolean isBluetoothAudioDevicePluggedIn() {
        if (VERSION.SDK_INT >= 23) {
            for (AudioDeviceInfo type : ((AudioManager) this.b.getSystemService("audio")).getDevices(2)) {
                if (type.getType() == 8) {
                    return true;
                }
            }
        }
        return false;
    }
}
