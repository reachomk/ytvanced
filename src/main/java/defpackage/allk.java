package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: allk */
public abstract class allk implements akmz, akot, alhm {
    private final akmx a;
    private final View b;
    public final akvp c;
    public final TextView d;
    public alkz e;
    public Object f;
    private final aloz g;
    private final TextView h = ((TextView) this.b.findViewById(R.id.user_public_name));
    private final ImageButton i = ((ImageButton) this.b.findViewById(R.id.invitation_button));

    public allk(Context context, aaas aaas, akmx akmx, akkq akkq, akvp akvp) {
        amqw.a((Object) context);
        amqw.a((Object) aaas);
        this.a = (akmx) amqw.a((Object) akmx);
        this.c = (akvp) amqw.a((Object) akvp);
        this.b = View.inflate(context, R.layout.connection, null);
        this.g = new aloz(akkq, (ImageView) this.b.findViewById(R.id.connection_thumbnail));
        ImageButton imageButton = (ImageButton) this.b.findViewById(R.id.ignore_invitation_button);
        this.d = (TextView) this.b.findViewById(R.id.invited_label);
        int b = b();
        if (b != 0) {
            this.i.setImageResource(b);
            this.i.setContentDescription(xvd.a(a(context.getResources())));
            this.i.setOnClickListener(new allp(this, aaas));
            this.i.setVisibility(0);
        }
        int c = c();
        if (c != 0) {
            imageButton.setImageResource(c);
            imageButton.setOnClickListener(new allo(this, aaas));
            imageButton.setVisibility(0);
        }
        View findViewById = this.b.findViewById(R.id.content);
        findViewById.setOnClickListener(new alln(this, aaas));
        findViewById.setOnLongClickListener(new allm(this, aaas));
    }

    public abstract alkz a(Object obj);

    /* Access modifiers changed, original: protected */
    public String a(Resources resources) {
        return null;
    }

    public final void a(akpb akpb) {
    }

    /* Access modifiers changed, original: protected */
    public void a(alkz alkz, aaas aaas) {
    }

    /* Access modifiers changed, original: protected */
    public void a(auvn auvn) {
    }

    /* Access modifiers changed, original: protected */
    public int b() {
        return 0;
    }

    /* Access modifiers changed, original: protected */
    public void b(alkz alkz, aaas aaas) {
    }

    /* Access modifiers changed, original: protected */
    public int c() {
        return 0;
    }

    public void d() {
    }

    public void e() {
    }

    public final View K_() {
        return this.b;
    }

    public final void a_(akor akor, Object obj) {
        this.f = obj;
        if (this.e != null) {
            this.a.a((akmz) this);
        }
        alkz a = a(obj);
        Uri a2 = alle.a(a.b());
        this.e = (alkz) this.a.b(a2, a);
        this.a.a(a2, (akmz) this);
        a(this.e);
    }

    public final void a(Uri uri, Uri uri2) {
        this.e = (alkz) this.a.a(uri);
        a(this.e);
    }

    /* Access modifiers changed, original: protected */
    public void a(alkz alkz) {
        aqif aqif = alkz.b;
        aqtk aqtk = null;
        if (aqif == null) {
            aqij aqij = alkz.c;
            if (aqij == null) {
                aqil aqil = alkz.d;
                if (!(aqil == null || (aqil.a & 2) == 0)) {
                    aqtk = aqil.c;
                    if (aqtk == null) {
                        aqtk = aqtk.c;
                    }
                }
            } else if ((aqij.a & 2) != 0) {
                aqtk = aqij.c;
                if (aqtk == null) {
                    aqtk = aqtk.c;
                }
            }
        } else if ((aqif.a & 2) != 0) {
            aqtk = aqif.c;
            if (aqtk == null) {
                aqtk = aqtk.c;
            }
        }
        aloq.a(aqtk, this.g);
        this.h.setText(alkz.c());
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(boolean z) {
        this.d.setVisibility(!z ? 8 : 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(boolean z) {
        this.i.setVisibility(!z ? 8 : 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0028  */
    public final void a(defpackage.aaas r5) {
        /*
        r4 = this;
        r0 = r4.e;
        if (r0 == 0) goto L_0x0089;
    L_0x0004:
        r1 = r0.b;
        r2 = 0;
        if (r1 == 0) goto L_0x0025;
    L_0x0009:
        r1 = r1.d;
        if (r1 != 0) goto L_0x000f;
    L_0x000d:
        r1 = defpackage.auvr.c;
    L_0x000f:
        r1 = r1.a;
        r1 = r1 & 1;
        if (r1 != 0) goto L_0x0016;
    L_0x0015:
        goto L_0x0025;
    L_0x0016:
        r0 = r0.b;
        r0 = r0.d;
        if (r0 != 0) goto L_0x001e;
    L_0x001c:
        r0 = defpackage.auvr.c;
    L_0x001e:
        r0 = r0.b;
        if (r0 != 0) goto L_0x0026;
    L_0x0022:
        r0 = defpackage.auvn.l;
        goto L_0x0026;
    L_0x0025:
        r0 = r2;
    L_0x0026:
        if (r0 != 0) goto L_0x0086;
    L_0x0028:
        r0 = r4.e;
        r1 = r0.b;
        if (r1 != 0) goto L_0x0062;
    L_0x002e:
        r1 = r0.c;
        if (r1 != 0) goto L_0x0055;
    L_0x0032:
        r1 = r0.d;
        if (r1 != 0) goto L_0x0048;
    L_0x0036:
        r0 = r0.e;
        if (r0 != 0) goto L_0x003b;
    L_0x003a:
        goto L_0x006e;
    L_0x003b:
        r1 = r0.a;
        r1 = r1 & 64;
        if (r1 == 0) goto L_0x006e;
    L_0x0041:
        r2 = r0.h;
        if (r2 != 0) goto L_0x006e;
    L_0x0045:
        r2 = defpackage.apxu.d;
        goto L_0x006e;
    L_0x0048:
        r0 = r1.a;
        r0 = r0 & 1024;
        if (r0 == 0) goto L_0x006e;
    L_0x004e:
        r2 = r1.i;
        if (r2 != 0) goto L_0x006e;
    L_0x0052:
        r2 = defpackage.apxu.d;
        goto L_0x006e;
    L_0x0055:
        r0 = r1.a;
        r0 = r0 & 128;
        if (r0 == 0) goto L_0x006e;
    L_0x005b:
        r2 = r1.g;
        if (r2 != 0) goto L_0x006e;
    L_0x005f:
        r2 = defpackage.apxu.d;
        goto L_0x006e;
    L_0x0062:
        r0 = r1.a;
        r0 = r0 & 256;
        if (r0 == 0) goto L_0x006e;
    L_0x0068:
        r2 = r1.h;
        if (r2 != 0) goto L_0x006e;
    L_0x006c:
        r2 = defpackage.apxu.d;
    L_0x006e:
        if (r2 != 0) goto L_0x0071;
    L_0x0070:
        return;
    L_0x0071:
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = "com.google.android.libraries.youtube.innertube.endpoint.tag";
        r0.put(r1, r4);
        r1 = r4.f;
        r3 = "contact_menu_source_model";
        r0.put(r3, r1);
        r5.a(r2, r0);
        return;
    L_0x0086:
        r4.a(r0);
    L_0x0089:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.allk.a(aaas):void");
    }
}
