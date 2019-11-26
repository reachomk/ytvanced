package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: bcjc */
public class bcjc {
    public final bcjr a;

    public bcjc(Context context) {
        ArrayList arrayList = new ArrayList(bcjg.a(context));
        if (arrayList.size() != 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bcjg) arrayList.get(i)).d();
            }
            if (arrayList.size() != 0) {
                Collections.sort(arrayList, new bcjb());
                this(((bcjg) arrayList.get(0)).a().a);
                return;
            }
            throw new RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
        }
        throw new RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
    }

    public bcjc(bcjr bcjr) {
        this.a = bcjr;
    }

    public bciz a() {
        return this.a.a();
    }
}
