package defpackage;

import com.google.android.libraries.youtube.upload.service.UploadService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: amcw */
final /* synthetic */ class amcw implements amcs {
    private final UploadService a;

    amcw(UploadService uploadService) {
        this.a = uploadService;
    }

    public final List a() {
        UploadService uploadService = this.a;
        ArrayList arrayList = new ArrayList();
        try {
            for (amea amea : uploadService.c.c().values()) {
                if (!(amea.c.isEmpty() || amea.M)) {
                    arrayList.add(amea);
                }
            }
        } catch (alzc unused) {
        }
        return Collections.unmodifiableList(arrayList);
    }
}
