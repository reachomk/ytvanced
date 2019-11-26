package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.firebase.appindexing.internal.Thing;
import java.util.concurrent.Executor;

/* renamed from: anna */
public final class anna extends anlu {
    private static String[] a = new String[]{"com.google.android.googlequicksearchbox", "com.google.android.gms"};
    private final annc b;
    private final Context c;

    public anna(Context context) {
        annd annd = new annd(context);
        this.c = context;
        this.b = new annc(annd);
    }

    public final ryi a(anmg... anmgArr) {
        try {
            Thing[] thingArr = new Thing[1];
            int i = 0;
            System.arraycopy(anmgArr, 0, thingArr, 0, 1);
            if (this.c != null) {
                Thing thing = thingArr[0];
                if (thing != null) {
                    anml anml = thing.a;
                    String str = "sliceUri";
                    Bundle bundle = anml.a;
                    String[] stringArray = (bundle == null || !(bundle.get(str) instanceof String[])) ? null : anml.a.getStringArray(str);
                    if (stringArray != null) {
                        String str2 = stringArray[0];
                        String[] strArr = a;
                        int length = strArr.length;
                        while (i < length) {
                            this.c.grantUriPermission(strArr[i], Uri.parse(str2), 66);
                            i++;
                        }
                    }
                }
            }
            return a(new anmo(1, thingArr, null, null));
        } catch (ArrayStoreException unused) {
            return rym.a(new anly("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects."));
        }
    }

    public final ryi b() {
        return a(new anmo(4, null, null, null));
    }

    private final ryi a(anmo anmo) {
        boolean isEmpty;
        Executor executor = this.b;
        annf annf = new annf(executor, anmo);
        rze rze = annf.b.a;
        rze.a(executor, (rye) executor);
        synchronized (executor.b) {
            isEmpty = executor.b.isEmpty();
            executor.b.add(annf);
        }
        if (isEmpty) {
            annf.a();
        }
        return rze;
    }
}
