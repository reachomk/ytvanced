package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.view.View;
import com.google.android.youtube.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: zha */
public final class zha {
    public static int a(Activity activity) {
        amqw.a((Object) activity);
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation == 3 ? 270 : 0;
        } else {
            return 180;
        }
    }

    public static void a(Context context, int i) {
        amqw.a((Object) context);
        Builder builder = new Builder(context, R.style.WhiteAlertDialogStyle);
        builder.setTitle(R.string.camera_can_not_record).setMessage(i).setCancelable(false).setPositiveButton(R.string.ok, null);
        AlertDialog create = builder.create();
        create.show();
        create.getButton(-2).setTextColor(context.getResources().getColor(R.color.camera_dialog_button_text_color));
        create.getButton(-1).setTextColor(context.getResources().getColor(R.color.camera_dialog_button_text_color));
    }

    public static void a(View view, boolean z) {
        amqw.a((Object) view);
        if (xrn.c(view.getContext())) {
            xrn.a(view.getContext(), view, view.getContext().getString(!z ? R.string.accessibility_recording_end : R.string.accessibility_recording_start));
        }
    }

    public static String a(long j) {
        return new SimpleDateFormat("'VID'_yyyyMMdd_HHmmssSSS", Locale.US).format(new Date(j));
    }

    public static long a() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    public static boolean b() {
        return TextUtils.equals(Environment.getExternalStorageState(), "mounted");
    }

    public static boolean a(Resources resources) {
        amqw.a((Object) resources);
        return resources.getConfiguration().getLayoutDirection() == 1;
    }
}
