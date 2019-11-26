package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.text.ParseException;

/* renamed from: airl */
public final class airl implements Parcelable {
    public static final Creator CREATOR = new airk();
    public final aiqq a;
    public final nky b;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086 A:{Catch:{ ParseException -> 0x00f8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0085 A:{Catch:{ ParseException -> 0x00f8 }} */
    @java.lang.Deprecated
    public static final defpackage.airl a(android.content.Intent r9) {
        /*
        defpackage.amqw.a(r9);
        r0 = r9.getData();
        r9 = r9.getExtras();
        r1 = 0;
        r2 = defpackage.aftn.a(r0);	 Catch:{ ParseException -> 0x00f8 }
        defpackage.amqw.a(r0);	 Catch:{ ParseException -> 0x00f8 }
        r3 = r0.isHierarchical();	 Catch:{ ParseException -> 0x00f8 }
        r4 = -1;
        if (r3 == 0) goto L_0x0082;
    L_0x001a:
        r3 = "playnext";
        r3 = r0.getQueryParameter(r3);	 Catch:{ ParseException -> 0x00f8 }
        if (r3 == 0) goto L_0x0026;
    L_0x0022:
        r5 = 0;
        defpackage.xvd.a(r3, r5);	 Catch:{ ParseException -> 0x00f8 }
    L_0x0026:
        r3 = "index";
        r3 = r0.getQueryParameter(r3);	 Catch:{ ParseException -> 0x00f8 }
        if (r3 == 0) goto L_0x0033;
    L_0x002e:
        r3 = defpackage.xvd.a(r3, r4);	 Catch:{ ParseException -> 0x00f8 }
        goto L_0x0034;
    L_0x0033:
        r3 = -1;
    L_0x0034:
        r5 = "list";
        r5 = r0.getQueryParameter(r5);	 Catch:{ ParseException -> 0x00f8 }
        r6 = android.text.TextUtils.isEmpty(r5);	 Catch:{ ParseException -> 0x00f8 }
        if (r6 == 0) goto L_0x007c;
    L_0x0040:
        r5 = "p";
        r5 = r0.getQueryParameter(r5);	 Catch:{ ParseException -> 0x00f8 }
        r6 = android.text.TextUtils.isEmpty(r5);	 Catch:{ ParseException -> 0x00f8 }
        if (r6 == 0) goto L_0x0076;
    L_0x004c:
        r5 = "https://gdata.youtube.com/feeds/api/playlists/(.*)";
        r5 = java.util.regex.Pattern.compile(r5);	 Catch:{ ParseException -> 0x00f8 }
        r0 = r0.toString();	 Catch:{ ParseException -> 0x00f8 }
        r0 = android.net.Uri.decode(r0);	 Catch:{ ParseException -> 0x00f8 }
        r0 = r5.matcher(r0);	 Catch:{ ParseException -> 0x00f8 }
        r5 = r0.matches();	 Catch:{ ParseException -> 0x00f8 }
        if (r5 == 0) goto L_0x0082;
    L_0x0064:
        r5 = 1;
        r0 = r0.group(r5);	 Catch:{ ParseException -> 0x00f8 }
        r5 = android.text.TextUtils.isEmpty(r0);	 Catch:{ ParseException -> 0x00f8 }
        if (r5 != 0) goto L_0x0082;
    L_0x006f:
        r5 = new aftj;	 Catch:{ ParseException -> 0x00f8 }
        r5.<init>(r0, r3);	 Catch:{ ParseException -> 0x00f8 }
        r0 = r5;
        goto L_0x0083;
    L_0x0076:
        r0 = new aftj;	 Catch:{ ParseException -> 0x00f8 }
        r0.<init>(r5, r3);	 Catch:{ ParseException -> 0x00f8 }
        goto L_0x0083;
    L_0x007c:
        r0 = new aftj;	 Catch:{ ParseException -> 0x00f8 }
        r0.<init>(r5, r3);	 Catch:{ ParseException -> 0x00f8 }
        goto L_0x0083;
    L_0x0082:
        r0 = r1;
    L_0x0083:
        if (r0 != 0) goto L_0x0086;
    L_0x0085:
        goto L_0x00dd;
    L_0x0086:
        r3 = r0.a;	 Catch:{ ParseException -> 0x00f8 }
        r3 = android.text.TextUtils.isEmpty(r3);	 Catch:{ ParseException -> 0x00f8 }
        if (r3 != 0) goto L_0x00dd;
    L_0x008e:
        r3 = defpackage.aiqq.a();	 Catch:{ ParseException -> 0x00f8 }
        r5 = r0.a;	 Catch:{ ParseException -> 0x00f8 }
        r0 = r0.b;	 Catch:{ ParseException -> 0x00f8 }
        r2 = r2.b;	 Catch:{ ParseException -> 0x00f8 }
        r6 = (long) r2;	 Catch:{ ParseException -> 0x00f8 }
        r2 = defpackage.azje.r;	 Catch:{ ParseException -> 0x00f8 }
        r2 = r2.createBuilder();	 Catch:{ ParseException -> 0x00f8 }
        r2 = (defpackage.azjd) r2;	 Catch:{ ParseException -> 0x00f8 }
        r8 = android.text.TextUtils.isEmpty(r5);	 Catch:{ ParseException -> 0x00f8 }
        if (r8 != 0) goto L_0x00aa;
    L_0x00a7:
        r2.b(r5);	 Catch:{ ParseException -> 0x00f8 }
    L_0x00aa:
        if (r0 == r4) goto L_0x00af;
    L_0x00ac:
        r2.a(r0);	 Catch:{ ParseException -> 0x00f8 }
    L_0x00af:
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ ParseException -> 0x00f8 }
        r4 = r0.toSeconds(r6);	 Catch:{ ParseException -> 0x00f8 }
        r0 = (float) r4;	 Catch:{ ParseException -> 0x00f8 }
        r2.a(r0);	 Catch:{ ParseException -> 0x00f8 }
        r0 = defpackage.apxu.d;	 Catch:{ ParseException -> 0x00f8 }
        r0 = r0.createBuilder();	 Catch:{ ParseException -> 0x00f8 }
        r0 = (defpackage.apxx) r0;	 Catch:{ ParseException -> 0x00f8 }
        r4 = com.google.protos.youtube.api.innertube.WatchEndpointOuterClass.watchEndpoint;	 Catch:{ ParseException -> 0x00f8 }
        r2 = r2.build();	 Catch:{ ParseException -> 0x00f8 }
        r2 = (defpackage.anxl) r2;	 Catch:{ ParseException -> 0x00f8 }
        r2 = (defpackage.azje) r2;	 Catch:{ ParseException -> 0x00f8 }
        r0.a(r4, r2);	 Catch:{ ParseException -> 0x00f8 }
        r0 = r0.build();	 Catch:{ ParseException -> 0x00f8 }
        r0 = (defpackage.anxl) r0;	 Catch:{ ParseException -> 0x00f8 }
        r0 = (defpackage.apxu) r0;	 Catch:{ ParseException -> 0x00f8 }
        r3.a = r0;	 Catch:{ ParseException -> 0x00f8 }
        r0 = r3.b();	 Catch:{ ParseException -> 0x00f8 }
        goto L_0x00ef;
    L_0x00dd:
        r0 = defpackage.aiqq.a();	 Catch:{ ParseException -> 0x00f8 }
        r3 = r2.a;	 Catch:{ ParseException -> 0x00f8 }
        r0.a(r3);	 Catch:{ ParseException -> 0x00f8 }
        r2 = r2.b;	 Catch:{ ParseException -> 0x00f8 }
        r2 = (long) r2;	 Catch:{ ParseException -> 0x00f8 }
        r0.g = r2;	 Catch:{ ParseException -> 0x00f8 }
        r0 = r0.b();	 Catch:{ ParseException -> 0x00f8 }
    L_0x00ef:
        r2 = new airl;	 Catch:{ ParseException -> 0x00f8 }
        r2.<init>(r0);	 Catch:{ ParseException -> 0x00f8 }
        r2.a(r9);	 Catch:{ ParseException -> 0x00f8 }
        return r2;
    L_0x00f8:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.airl.a(android.content.Intent):airl");
    }

    public final int describeContents() {
        return 0;
    }

    @Deprecated
    public static final airl b(Intent intent) {
        amqw.a((Object) intent);
        try {
            String[] stringArray = intent.getExtras().getStringArray("android.intent.extra.inventory_identifier");
            if (stringArray != null && stringArray.length == 1) {
                aftn a = aftn.a(Uri.parse(stringArray[0]));
                aiqs a2 = aiqq.a();
                a2.a(a.a);
                a2.g = (long) a.b;
                return new airl(a2.b());
            }
        } catch (ParseException unused) {
        }
        return null;
    }

    public airl(aiqq aiqq) {
        this.b = (nky) nkv.j.createBuilder();
        this.a = (aiqq) amqw.a((Object) aiqq);
    }

    public final void a(Bundle bundle) {
        boolean z = bundle.getBoolean("finish_on_ended", false);
        nky nky = this.b;
        nky.copyOnWrite();
        nkv nkv = (nkv) nky.instance;
        nkv.a |= 2;
        nkv.c = z;
        z = bundle.getBoolean("force_fullscreen", false);
        nky = this.b;
        nky.copyOnWrite();
        nkv = (nkv) nky.instance;
        nkv.a |= 4;
        nkv.d = z;
        b();
        b(bundle.getBoolean("skip_remote_route_dialog", false));
        boolean z2 = bundle.getBoolean("is_loopback", false);
        a(z2);
        nky nky2 = this.b;
        nky2.copyOnWrite();
        nkv nkv2 = (nkv) nky2.instance;
        nkv2.a |= 64;
        nkv2.h = z2 ^ 1;
    }

    public final boolean a() {
        return ((nkv) this.b.instance).h;
    }

    public final void a(boolean z) {
        nky nky = this.b;
        nky.copyOnWrite();
        nkv nkv = (nkv) nky.instance;
        nkv.a |= 32;
        nkv.g = z;
    }

    public final void b() {
        nky nky = this.b;
        nky.copyOnWrite();
        nkv nkv = (nkv) nky.instance;
        nkv.a |= 8;
        nkv.e = true;
    }

    public final void b(boolean z) {
        nky nky = this.b;
        nky.copyOnWrite();
        nkv nkv = (nkv) nky.instance;
        nkv.a |= 16;
        nkv.f = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        nky nky = this.b;
        nkm nkm = this.a.a;
        nky.copyOnWrite();
        nkv nkv = (nkv) nky.instance;
        if (nkm != null) {
            nkv.b = nkm;
            nkv.a |= 1;
            parcel.writeByteArray(((nkv) ((anxl) this.b.build())).toByteArray());
            return;
        }
        throw new NullPointerException();
    }
}
