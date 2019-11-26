package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import com.google.android.youtube.R;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: zqb */
public final class zqb {
    public static Uri a(Context context) {
        String format = new SimpleDateFormat(context.getString(R.string.video_file_name_format), Locale.US).format(new Date());
        try {
            String str = ".mp4";
            if (xy.a()) {
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                format = String.valueOf(format);
                if (str.length() == 0) {
                    str = new String(format);
                } else {
                    str = format.concat(str);
                }
                return Uri.fromFile(new File(externalStoragePublicDirectory, str));
            }
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera");
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.isDirectory() && file.canWrite()) {
                format = String.valueOf(format);
                if (str.length() == 0) {
                    str = new String(format);
                } else {
                    str = format.concat(str);
                }
                return Uri.fromFile(new File(file, str));
            }
            throw new RuntimeException("Camera roll directory not accessible.");
        } catch (IOException e) {
            throw new RuntimeException("Failed to create temp photo file.", e);
        }
    }

    public static Uri a(Uri uri, Context context) {
        if (!xy.a()) {
            return uri;
        }
        return rc.a(context, "com.google.android.youtube.fileprovider", new File(uri.getPath()));
    }
}
