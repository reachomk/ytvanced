package defpackage;

import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import java.util.ArrayList;

/* renamed from: akdp */
final /* synthetic */ class akdp implements bbnp {
    private final akdq a;

    akdp(akdq akdq) {
        this.a = akdq;
    }

    public final void a() {
        akdq akdq = this.a;
        ((UnifiedTemplateResolver) akdq.b.get()).jni_preloadTemplateConfigs();
        if (akdq.c) {
            ArrayList arrayList = new ArrayList(akdq.a.keySet());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                byte[] bArr = (byte[]) akdq.a.get((String) arrayList.get(i));
                if (bArr != null) {
                    ((UnifiedTemplateResolver) akdq.b.get()).a(bArr, null, null, akdq.d, true);
                }
            }
            akdq.a.keySet().removeAll(arrayList);
        }
    }
}
