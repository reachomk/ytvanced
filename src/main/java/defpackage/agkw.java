package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StrictMode;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: agkw */
public final class agkw {
    public static void a(Activity activity, String str) {
        String valueOf = String.valueOf(Environment.getExternalStorageDirectory());
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 10);
        stringBuilder.append(valueOf);
        stringBuilder.append("/ytlog.txt");
        valueOf = stringBuilder.toString();
        File file = new File(valueOf);
        try {
            file.delete();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(str);
            fileWriter.close();
            if (VERSION.SDK_INT >= 24) {
                try {
                    StrictMode.class.getMethod("disableDeathOnFileUriExposure", new Class[0]).invoke(null, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.SUBJECT", "Offline Streams Report");
            intent.putExtra("android.intent.extra.TEXT", "see attachment");
            valueOf = String.valueOf(valueOf);
            String str2 = "file://";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            intent.putExtra("android.intent.extra.STREAM", Uri.parse(valueOf));
            intent.setType("text/plain");
            activity.startActivity(Intent.createChooser(intent, "Send Email"));
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void a(Activity activity) {
        if (ra.a((Context) activity, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            mp.a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
        }
    }
}
