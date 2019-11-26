package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: oti */
public final class oti extends ori {
    private static final int a = ozp.f("payl");
    private static final int b = ozp.f("sttg");
    private static final int c = ozp.f("vttc");
    private final oza d = new oza();
    private final otl e = new otl();

    public oti() {
        super("Mp4WebvttDecoder");
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ ork a(byte[] bArr, int i, boolean z) {
        this.d.a(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.d.b() > 0) {
            if (this.d.b() >= 8) {
                i = this.d.k();
                if (this.d.k() == c) {
                    oza oza = this.d;
                    otl otl = this.e;
                    i -= 8;
                    otl.a();
                    while (i > 0) {
                        if (i >= 8) {
                            int k = oza.k();
                            int k2 = oza.k();
                            k -= 8;
                            String a = ozp.a(oza.a, oza.b, k);
                            oza.d(k);
                            i = (i - 8) - k;
                            if (k2 == b) {
                                oto.a(a, otl);
                            } else if (k2 == a) {
                                oto.a(null, a.trim(), otl, Collections.emptyList());
                            }
                        } else {
                            throw new orm("Incomplete vtt cue box header found.");
                        }
                    }
                    arrayList.add(otl.b());
                } else {
                    this.d.d(i - 8);
                }
            } else {
                throw new orm("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new oth(arrayList);
    }
}
