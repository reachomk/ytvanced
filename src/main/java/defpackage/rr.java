package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.Base64;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: rr */
public final class rr {
    public static List a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                List emptyList = Collections.emptyList();
                return emptyList;
            }
            int type;
            ArrayList arrayList = new ArrayList();
            if (VERSION.SDK_INT >= 21) {
                type = obtainTypedArray.getType(0);
            } else {
                TypedValue typedValue = new TypedValue();
                obtainTypedArray.getValue(0, typedValue);
                type = typedValue.type;
            }
            if (type != 1) {
                arrayList.add(rr.a(resources.getStringArray(i)));
            } else {
                for (i = 0; i < obtainTypedArray.length(); i++) {
                    type = obtainTypedArray.getResourceId(i, 0);
                    if (type != 0) {
                        arrayList.add(rr.a(resources.getStringArray(type)));
                    }
                }
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static List a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    public static void a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
