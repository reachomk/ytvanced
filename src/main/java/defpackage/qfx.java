package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;

/* renamed from: qfx */
public final class qfx implements qhd {
    public static final Status a = new Status(13);

    public final ptg a(ptd ptd, Activity activity, Intent intent) {
        return ptd.a(new qgs(this, ptd, intent, new WeakReference(activity)));
    }

    static void a(qgc qgc, Activity activity, Intent intent, GoogleHelp googleHelp) {
        String str = "EXTRA_GOOGLE_HELP";
        if (intent.hasExtra(str)) {
            intent.putExtra(str, googleHelp);
        } else {
            str = "EXTRA_IN_PRODUCT_HELP";
            if (intent.hasExtra(str)) {
                qoy qoy;
                Object obj = qfv.CREATOR;
                byte[] byteArrayExtra = intent.getByteArrayExtra(str);
                if (byteArrayExtra == null) {
                    qoy = null;
                } else {
                    pzr.a(obj);
                    int length = byteArrayExtra.length;
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(byteArrayExtra, 0, length);
                    obtain.setDataPosition(0);
                    qoy = (qoy) obj.createFromParcel(obtain);
                    obtain.recycle();
                }
                qfv qfv = (qfv) qoy;
                qfv.a = googleHelp;
                Parcel obtain2 = Parcel.obtain();
                qfv.writeToParcel(obtain2, 0);
                byte[] marshall = obtain2.marshall();
                obtain2.recycle();
                intent.putExtra(str, marshall);
            }
        }
        activity.startActivityForResult(intent, 123);
        qgc.a(Status.a);
    }

    static String a(Activity activity) {
        String charSequence = activity.getTitle().toString();
        int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
        if (identifier != 0) {
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(identifier);
            if (viewGroup != null) {
                for (identifier = 0; identifier < viewGroup.getChildCount(); identifier++) {
                    View childAt = viewGroup.getChildAt(identifier);
                    if (childAt instanceof TextView) {
                        return ((TextView) childAt).getText().toString();
                    }
                }
            }
        }
        return charSequence;
    }

    public final ptg a(ptd ptd, GoogleHelp googleHelp, Bundle bundle, long j) {
        return ptd.a(new qga(ptd, bundle, j, googleHelp));
    }

    public final ptg b(ptd ptd, GoogleHelp googleHelp, Bundle bundle, long j) {
        return ptd.a(new qgu(ptd, bundle, j, googleHelp));
    }

    public final ptg a(ptd ptd, GoogleHelp googleHelp, qdx qdx, Bundle bundle, long j) {
        return ptd.a(new qgw(ptd, qdx, bundle, j, googleHelp));
    }
}
