package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.youtube.common.customtabs.CustomTabsReceiver;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: xbi */
public final class xbi implements xbg {
    private static final int[] a = new int[]{R.attr.homeAsUpIndicator};
    private final Context b;
    private String c;
    private final avce d;

    public xbi(Context context, avce avce) {
        this.b = (Context) amqw.a((Object) context);
        this.d = (avce) amqw.a((Object) avce);
        try {
            this.c = bcip.a(context);
        } catch (Exception unused) {
            this.c = null;
        }
    }

    public final boolean a(Activity activity, Uri uri) {
        Activity activity2 = activity;
        Uri uri2 = uri;
        if (!TextUtils.isEmpty(this.c)) {
            Context context = this.b;
            wxp wxp = wxk.a;
            HashSet hashSet = new HashSet();
            int i = 65536;
            List queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri2), 65536);
            if (queryIntentActivities != null) {
                int size = queryIntentActivities.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = ((ResolveInfo) queryIntentActivities.get(i2)).activityInfo.packageName;
                    Set set = wxp.b;
                    if (set == null) {
                        wxp.b = new HashSet();
                        List queryIntentActivities2 = context.getPackageManager().queryIntentActivities(wxp.a, i);
                        int size2 = queryIntentActivities2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            wxp.b.add(((ResolveInfo) queryIntentActivities2.get(i3)).activityInfo.packageName);
                        }
                        set = wxp.b;
                    }
                    if (!set.contains(str)) {
                        hashSet.add(str);
                    }
                    i2++;
                    i = 65536;
                }
            }
            if (hashSet.isEmpty()) {
                auc auc = new auc();
                TypedArray obtainStyledAttributes = activity2.obtainStyledAttributes(a);
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                obtainStyledAttributes.recycle();
                int i4 = -16777216;
                if (this.d.c) {
                    i4 = xwe.a(activity2, R.attr.colorPrimary, -16777216);
                }
                auc.a(false);
                auc.a(i4);
                auc.a(BitmapFactory.decodeResource(activity.getResources(), resourceId));
                auc.b = mt.a(this.b, R.anim.slide_in_right, R.anim.abc_fade_out).a();
                auc.a(BitmapFactory.decodeResource(this.b.getResources(), R.drawable.quantum_ic_share_white_24), this.b.getString(R.string.accessibility_share_page), PendingIntent.getBroadcast(this.b, 0, new Intent(this.b, CustomTabsReceiver.class), 134217728), false);
                aud a = auc.a();
                a.a.setPackage(this.c);
                wxk.a(this.b, a.a, uri2);
                a.a.putExtra("com.android.browser.application_id", this.b.getPackageName());
                a.a(activity2, uri2);
                return true;
            }
        }
        return false;
    }
}
