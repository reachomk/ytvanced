package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.TextContent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cmi */
public final class cmi {
    public static void a(int i, int i2, aaf aaf, aaf aaf2) {
        Object a;
        if (cmi.a(i, aaf2)) {
            a = aaf2.a(i);
            aaf2.b(i);
        } else {
            a = aaf.a(i);
            aaf.b(i);
        }
        aaf.b(i2, a);
    }

    public static void a(int i, aaf aaf, aaf aaf2) {
        if (aaf != null && aaf2 != null) {
            Object a = aaf.a(i);
            if (a != null) {
                aaf2.b(i, a);
            }
        }
    }

    private static boolean a(int i, aaf aaf) {
        return (aaf == null || aaf.a(i) == null) ? false : true;
    }

    public static void a(View view, Drawable drawable, int i, cqi cqi) {
        if (((cqi != null && cqi.b()) || cqb.a(i)) && drawable.isStateful()) {
            drawable.setState(view.getDrawableState());
        }
    }

    public static void b(int i, aaf aaf, aaf aaf2) {
        if (cmi.a(i, aaf2)) {
            aaf2.b(i);
        } else {
            aaf.b(i);
        }
    }

    public static TextContent a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 1) {
            Object obj = list.get(0);
            return !(obj instanceof TextContent) ? TextContent.a : (TextContent) obj;
        }
        ArrayList arrayList = new ArrayList();
        while (i < size) {
            Object obj2 = list.get(i);
            if (obj2 instanceof TextContent) {
                arrayList.addAll(((TextContent) obj2).getTextItems());
            }
            i++;
        }
        return new cml(arrayList);
    }

    public static void a(cqb cqb) {
        if (cqb.b()) {
            cqb.e.h();
        }
    }
}
