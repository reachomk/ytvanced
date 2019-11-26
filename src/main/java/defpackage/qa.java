package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

/* renamed from: qa */
public final class qa {
    public static Intent a(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String b = qa.b(activity);
        if (b != null) {
            ComponentName componentName = new ComponentName(activity, b);
            try {
                Intent component;
                if (qa.b(activity, componentName) != null) {
                    component = new Intent().setComponent(componentName);
                } else {
                    component = Intent.makeMainActivity(componentName);
                }
                return component;
            } catch (NameNotFoundException unused) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("getParentActivityIntent: bad parentActivityName '");
                stringBuilder.append(b);
                stringBuilder.append("' in manifest");
                Log.e("NavUtils", stringBuilder.toString());
            }
        }
        return null;
    }

    public static Intent a(Context context, ComponentName componentName) {
        String b = qa.b(context, componentName);
        if (b == null) {
            return null;
        }
        Intent component;
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b);
        if (qa.b(context, componentName2) != null) {
            component = new Intent().setComponent(componentName2);
        } else {
            component = Intent.makeMainActivity(componentName2);
        }
        return component;
    }

    public static String b(Activity activity) {
        try {
            return qa.b(activity, activity.getComponentName());
        } catch (NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static String b(Context context, ComponentName componentName) {
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData != null) {
            String string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY");
            if (string != null) {
                if (string.charAt(0) != '.') {
                    return string;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(context.getPackageName());
                stringBuilder.append(string);
                return stringBuilder.toString();
            }
        }
        return null;
    }
}
