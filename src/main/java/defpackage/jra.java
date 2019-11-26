package defpackage;

import android.os.Parcelable;
import com.google.protos.youtube.api.innertube.ChipCloudRendererOuterClass;

/* renamed from: jra */
final class jra extends akyd {
    public final arjh a;
    public final amqp b;
    public final aafn c;
    public final Parcelable d;
    public final boolean e;

    /* synthetic */ jra(arjh arjh, amqp amqp, aafn aafn, ans ans, boolean z) {
        int intValue = ((Integer) amqp.a(Integer.valueOf(-1))).intValue();
        if (arjh != null) {
            int i = 0;
            while (i < arjh.a()) {
                axak a = arjh.a(i);
                anxr access$000 = anxl.checkIsLite(ChipCloudRendererOuterClass.chipCloudChipRenderer);
                a.a(access$000);
                if (a.h.a(access$000.d)) {
                    a = arjh.a(i);
                    access$000 = anxl.checkIsLite(ChipCloudRendererOuterClass.chipCloudChipRenderer);
                    a.a(access$000);
                    Object b = a.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    aptk aptk = (aptk) ((anxo) ((aptl) b).toBuilder());
                    aptk.a(i == intValue);
                    axaj axaj = (axaj) axak.a.createBuilder();
                    axaj.a(ChipCloudRendererOuterClass.chipCloudChipRenderer, (aptl) ((anxl) aptk.build()));
                    arjh.a(i, axaj);
                }
                i++;
            }
        }
        this.b = amqp;
        this.c = aafn;
        this.d = ans.j();
        this.a = arjh;
        this.e = z;
    }
}
