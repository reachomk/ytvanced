package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pjz */
public final class pjz extends qou {
    public static final Creator CREATOR = new ppy();
    public MediaInfo a;
    public long b;
    public int c;
    public double d;
    public int e;
    public int f;
    public long g;
    public double h;
    public boolean i;
    public long[] j;
    public int k;
    public int l;
    public int m;
    public final ArrayList n;
    public boolean o;
    private long p;
    private String q;
    private JSONObject r;
    private pjc s;
    private pkn t;
    private final SparseArray u;

    pjz(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, List list, boolean z2, pjc pjc, pkn pkn) {
        List list2 = list;
        this.n = new ArrayList();
        this.u = new SparseArray();
        this.a = mediaInfo;
        this.b = j;
        this.c = i;
        this.d = d;
        this.e = i2;
        this.f = i3;
        this.g = j2;
        this.p = j3;
        this.h = d2;
        this.i = z;
        this.j = jArr;
        this.k = i4;
        this.l = i5;
        this.q = str;
        String str2 = this.q;
        if (str2 != null) {
            try {
                this.r = new JSONObject(str2);
            } catch (JSONException unused) {
                this.r = null;
                this.q = null;
            }
        } else {
            this.r = null;
        }
        this.m = i6;
        if (!(list2 == null || list.isEmpty())) {
            a((pjy[]) list2.toArray(new pjy[list.size()]));
        }
        this.o = z2;
        this.s = pjc;
        this.t = pkn;
    }

    public static boolean a(int i, int i2, int i3, int i4) {
        if (i != 1) {
            return false;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return i4 != 2;
            } else {
                if (i2 != 3) {
                    return true;
                }
            }
        }
        return i3 == 0;
    }

    public pjz(JSONObject jSONObject) {
        this(null, 0, 0, 0.0d, 0, 0, 0, 0, 0.0d, false, null, 0, 0, null, 0, null, false, null, null);
        a(jSONObject, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x032e  */
    /* JADX WARNING: Missing block: B:175:0x02c6, code skipped:
            if (r15 == 0) goto L_0x02e5;
     */
    public final int a(org.json.JSONObject r14, int r15) {
        /*
        r13 = this;
        r0 = "mediaSessionId";
        r0 = r14.getLong(r0);
        r2 = r13.b;
        r4 = 0;
        r5 = 1;
        r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r6 == 0) goto L_0x0012;
    L_0x000e:
        r13.b = r0;
        r0 = 1;
        goto L_0x0013;
    L_0x0012:
        r0 = 0;
    L_0x0013:
        r1 = "playerState";
        r2 = r14.has(r1);
        r3 = 3;
        r6 = 2;
        if (r2 == 0) goto L_0x0090;
    L_0x001d:
        r1 = r14.getString(r1);
        r2 = "IDLE";
        r2 = r1.equals(r2);
        r7 = 4;
        if (r2 != 0) goto L_0x004a;
    L_0x002a:
        r2 = "PLAYING";
        r2 = r1.equals(r2);
        if (r2 != 0) goto L_0x0048;
    L_0x0032:
        r2 = "PAUSED";
        r2 = r1.equals(r2);
        if (r2 != 0) goto L_0x0046;
    L_0x003a:
        r2 = "BUFFERING";
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x0044;
    L_0x0042:
        r1 = 0;
        goto L_0x004b;
    L_0x0044:
        r1 = 4;
        goto L_0x004b;
    L_0x0046:
        r1 = 3;
        goto L_0x004b;
    L_0x0048:
        r1 = 2;
        goto L_0x004b;
    L_0x004a:
        r1 = 1;
    L_0x004b:
        r2 = r13.e;
        if (r1 == r2) goto L_0x0053;
    L_0x004f:
        r13.e = r1;
        r0 = r0 | 2;
    L_0x0053:
        if (r1 != r5) goto L_0x0090;
    L_0x0055:
        r1 = "idleReason";
        r2 = r14.has(r1);
        if (r2 == 0) goto L_0x0090;
    L_0x005d:
        r1 = r14.getString(r1);
        r2 = "CANCELLED";
        r2 = r1.equals(r2);
        if (r2 != 0) goto L_0x0087;
    L_0x0069:
        r2 = "INTERRUPTED";
        r2 = r1.equals(r2);
        if (r2 != 0) goto L_0x0085;
    L_0x0071:
        r2 = "FINISHED";
        r2 = r1.equals(r2);
        if (r2 != 0) goto L_0x0083;
    L_0x0079:
        r2 = "ERROR";
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x0088;
    L_0x0081:
        r7 = 0;
        goto L_0x0088;
    L_0x0083:
        r7 = 1;
        goto L_0x0088;
    L_0x0085:
        r7 = 3;
        goto L_0x0088;
    L_0x0087:
        r7 = 2;
    L_0x0088:
        r1 = r13.f;
        if (r7 == r1) goto L_0x0090;
    L_0x008c:
        r13.f = r7;
        r0 = r0 | 2;
    L_0x0090:
        r1 = "playbackRate";
        r2 = r14.has(r1);
        if (r2 == 0) goto L_0x00a6;
    L_0x0098:
        r1 = r14.getDouble(r1);
        r7 = r13.d;
        r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
        if (r9 == 0) goto L_0x00a6;
    L_0x00a2:
        r13.d = r1;
        r0 = r0 | 2;
    L_0x00a6:
        r1 = "currentTime";
        r2 = r14.has(r1);
        if (r2 == 0) goto L_0x00c8;
    L_0x00ae:
        r2 = r15 & 2;
        if (r2 != 0) goto L_0x00c8;
    L_0x00b2:
        r1 = r14.getDouble(r1);
        r7 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r1 = r1 * r7;
        r1 = (long) r1;
        r7 = r13.g;
        r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r9 == 0) goto L_0x00c8;
    L_0x00c4:
        r13.g = r1;
        r0 = r0 | 2;
    L_0x00c8:
        r1 = "supportedMediaCommands";
        r2 = r14.has(r1);
        if (r2 == 0) goto L_0x00de;
    L_0x00d0:
        r1 = r14.getLong(r1);
        r7 = r13.p;
        r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r9 == 0) goto L_0x00de;
    L_0x00da:
        r13.p = r1;
        r0 = r0 | 2;
    L_0x00de:
        r1 = "volume";
        r2 = r14.has(r1);
        if (r2 == 0) goto L_0x010b;
    L_0x00e6:
        r15 = r15 & r5;
        if (r15 != 0) goto L_0x010b;
    L_0x00e9:
        r15 = r14.getJSONObject(r1);
        r1 = "level";
        r1 = r15.getDouble(r1);
        r7 = r13.h;
        r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r9 == 0) goto L_0x00fd;
    L_0x00f9:
        r13.h = r1;
        r0 = r0 | 2;
    L_0x00fd:
        r1 = "muted";
        r15 = r15.getBoolean(r1);
        r1 = r13.i;
        if (r15 == r1) goto L_0x010b;
    L_0x0107:
        r13.i = r15;
        r0 = r0 | 2;
    L_0x010b:
        r15 = "activeTrackIds";
        r1 = r14.has(r15);
        r2 = 0;
        if (r1 == 0) goto L_0x014a;
    L_0x0114:
        r15 = r14.getJSONArray(r15);
        r1 = r15.length();
        r7 = new long[r1];
        r8 = 0;
    L_0x011f:
        if (r8 >= r1) goto L_0x012a;
    L_0x0121:
        r9 = r15.getLong(r8);
        r7[r8] = r9;
        r8 = r8 + 1;
        goto L_0x011f;
    L_0x012a:
        r15 = r13.j;
        if (r15 == 0) goto L_0x0144;
    L_0x012e:
        r15 = r15.length;
        if (r15 == r1) goto L_0x0132;
    L_0x0131:
        goto L_0x0144;
    L_0x0132:
        r15 = 0;
    L_0x0133:
        if (r15 >= r1) goto L_0x0142;
    L_0x0135:
        r8 = r13.j;
        r9 = r8[r15];
        r11 = r7[r15];
        r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r8 != 0) goto L_0x0144;
    L_0x013f:
        r15 = r15 + 1;
        goto L_0x0133;
    L_0x0142:
        r15 = 0;
        goto L_0x0145;
    L_0x0144:
        r15 = 1;
    L_0x0145:
        if (r15 == 0) goto L_0x0153;
    L_0x0147:
        r13.j = r7;
        goto L_0x0153;
    L_0x014a:
        r15 = r13.j;
        if (r15 != 0) goto L_0x0151;
    L_0x014e:
        r7 = r2;
        r15 = 0;
        goto L_0x0153;
    L_0x0151:
        r7 = r2;
        r15 = 1;
    L_0x0153:
        if (r15 == 0) goto L_0x0159;
    L_0x0155:
        r13.j = r7;
        r0 = r0 | 2;
    L_0x0159:
        r15 = "customData";
        r1 = r14.has(r15);
        if (r1 == 0) goto L_0x016b;
    L_0x0161:
        r15 = r14.getJSONObject(r15);
        r13.r = r15;
        r13.q = r2;
        r0 = r0 | 2;
    L_0x016b:
        r15 = "media";
        r1 = r14.has(r15);
        if (r1 == 0) goto L_0x0194;
    L_0x0173:
        r15 = r14.getJSONObject(r15);
        r1 = new com.google.android.gms.cast.MediaInfo;
        r1.<init>(r15);
        r2 = r13.a;
        if (r2 == 0) goto L_0x0186;
    L_0x0180:
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x018a;
    L_0x0186:
        r13.a = r1;
        r0 = r0 | 2;
    L_0x018a:
        r1 = "metadata";
        r15 = r15.has(r1);
        if (r15 == 0) goto L_0x0194;
    L_0x0192:
        r0 = r0 | 4;
    L_0x0194:
        r15 = "currentItemId";
        r15 = r14.has(r15);
        if (r15 == 0) goto L_0x01aa;
    L_0x019c:
        r15 = "currentItemId";
        r15 = r14.getInt(r15);
        r1 = r13.c;
        if (r1 == r15) goto L_0x01aa;
    L_0x01a6:
        r13.c = r15;
        r0 = r0 | 2;
    L_0x01aa:
        r15 = "preloadedItemId";
        r15 = r14.optInt(r15, r4);
        r1 = r13.l;
        if (r1 == r15) goto L_0x01b8;
    L_0x01b4:
        r13.l = r15;
        r0 = r0 | 16;
    L_0x01b8:
        r15 = "loadingItemId";
        r15 = r14.optInt(r15, r4);
        r1 = r13.k;
        if (r1 == r15) goto L_0x01c7;
    L_0x01c2:
        r13.k = r15;
        r0 = r0 | 2;
        goto L_0x01c8;
    L_0x01c7:
        r15 = r1;
    L_0x01c8:
        r1 = r13.a;
        if (r1 == 0) goto L_0x01cf;
    L_0x01cc:
        r1 = r1.b;
        goto L_0x01d0;
    L_0x01cf:
        r1 = -1;
    L_0x01d0:
        r2 = r13.e;
        r7 = r13.f;
        r15 = defpackage.pjz.a(r2, r7, r15, r1);
        if (r15 != 0) goto L_0x02c9;
    L_0x01da:
        r15 = "repeatMode";
        r15 = r14.has(r15);
        if (r15 == 0) goto L_0x0233;
    L_0x01e2:
        r15 = r13.m;
        r1 = "repeatMode";
        r1 = r14.getString(r1);
        r2 = r1.hashCode();
        switch(r2) {
            case -1118317585: goto L_0x0210;
            case -962896020: goto L_0x0206;
            case 1645938909: goto L_0x01fc;
            case 1645952171: goto L_0x01f2;
            default: goto L_0x01f1;
        };
    L_0x01f1:
        goto L_0x021a;
    L_0x01f2:
        r2 = "REPEAT_OFF";
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x021a;
    L_0x01fa:
        r1 = 0;
        goto L_0x021b;
    L_0x01fc:
        r2 = "REPEAT_ALL";
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x021a;
    L_0x0204:
        r1 = 1;
        goto L_0x021b;
    L_0x0206:
        r2 = "REPEAT_SINGLE";
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x021a;
    L_0x020e:
        r1 = 2;
        goto L_0x021b;
    L_0x0210:
        r2 = "REPEAT_ALL_AND_SHUFFLE";
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x021a;
    L_0x0218:
        r1 = 3;
        goto L_0x021b;
    L_0x021a:
        r1 = -1;
    L_0x021b:
        if (r1 == 0) goto L_0x022a;
    L_0x021d:
        if (r1 == r5) goto L_0x0228;
    L_0x021f:
        if (r1 == r6) goto L_0x0226;
    L_0x0221:
        if (r1 == r3) goto L_0x0224;
    L_0x0223:
        goto L_0x022b;
    L_0x0224:
        r15 = 3;
        goto L_0x022b;
    L_0x0226:
        r15 = 2;
        goto L_0x022b;
    L_0x0228:
        r15 = 1;
        goto L_0x022b;
    L_0x022a:
        r15 = 0;
    L_0x022b:
        r1 = r13.m;
        if (r1 == r15) goto L_0x0233;
    L_0x022f:
        r13.m = r15;
        r15 = 1;
        goto L_0x0234;
    L_0x0233:
        r15 = 0;
    L_0x0234:
        r1 = "items";
        r1 = r14.has(r1);
        if (r1 == 0) goto L_0x02c6;
    L_0x023c:
        r1 = "items";
        r1 = r14.getJSONArray(r1);
        r2 = r1.length();
        r3 = new android.util.SparseArray;
        r3.<init>();
        r7 = 0;
    L_0x024c:
        if (r7 >= r2) goto L_0x0262;
    L_0x024e:
        r8 = r1.getJSONObject(r7);
        r9 = "itemId";
        r8 = r8.getInt(r9);
        r8 = java.lang.Integer.valueOf(r8);
        r3.put(r7, r8);
        r7 = r7 + 1;
        goto L_0x024c;
    L_0x0262:
        r7 = new defpackage.pjy[r2];
        r8 = r15;
        r15 = 0;
    L_0x0266:
        if (r15 >= r2) goto L_0x02b8;
    L_0x0268:
        r9 = r3.get(r15);
        r9 = (java.lang.Integer) r9;
        r10 = r1.getJSONObject(r15);
        r11 = r9.intValue();
        r11 = r13.a(r11);
        if (r11 == 0) goto L_0x0292;
    L_0x027c:
        r10 = r11.a(r10);
        r8 = r8 | r10;
        r7[r15] = r11;
        r9 = r9.intValue();
        r9 = r13.b(r9);
        r9 = r9.intValue();
        if (r15 != r9) goto L_0x02b4;
    L_0x0291:
        goto L_0x02b5;
    L_0x0292:
        r8 = r9.intValue();
        r9 = r13.c;
        if (r8 != r9) goto L_0x02ad;
    L_0x029a:
        r8 = r13.a;
        if (r8 == 0) goto L_0x02ad;
    L_0x029e:
        r9 = new pjx;
        r9.<init>(r8);
        r8 = r9.a();
        r7[r15] = r8;
        r8.a(r10);
        goto L_0x02b4;
    L_0x02ad:
        r8 = new pjy;
        r8.<init>(r10);
        r7[r15] = r8;
    L_0x02b4:
        r8 = 1;
    L_0x02b5:
        r15 = r15 + 1;
        goto L_0x0266;
    L_0x02b8:
        r15 = r13.n;
        r15 = r15.size();
        if (r15 != r2) goto L_0x02c2;
    L_0x02c0:
        r15 = r8;
        goto L_0x02c3;
    L_0x02c2:
        r15 = 1;
    L_0x02c3:
        r13.a(r7);
    L_0x02c6:
        if (r15 == 0) goto L_0x02e5;
    L_0x02c8:
        goto L_0x02e3;
    L_0x02c9:
        r13.c = r4;
        r13.k = r4;
        r13.l = r4;
        r15 = r13.n;
        r15 = r15.isEmpty();
        if (r15 != 0) goto L_0x02e5;
    L_0x02d7:
        r13.m = r4;
        r15 = r13.n;
        r15.clear();
        r15 = r13.u;
        r15.clear();
    L_0x02e3:
        r0 = r0 | 8;
    L_0x02e5:
        r15 = "breakStatus";
        r15 = r14.optJSONObject(r15);
        r15 = defpackage.pjc.a(r15);
        r1 = r13.s;
        if (r1 != 0) goto L_0x02f5;
    L_0x02f3:
        if (r15 != 0) goto L_0x02fe;
    L_0x02f5:
        if (r1 == 0) goto L_0x0307;
    L_0x02f7:
        r1 = r1.equals(r15);
        if (r1 == 0) goto L_0x02fe;
    L_0x02fd:
        goto L_0x0307;
    L_0x02fe:
        if (r15 == 0) goto L_0x0301;
    L_0x0300:
        r4 = 1;
    L_0x0301:
        r13.o = r4;
        r13.s = r15;
        r0 = r0 | 32;
    L_0x0307:
        r15 = "videoInfo";
        r15 = r14.optJSONObject(r15);
        r15 = defpackage.pkn.a(r15);
        r1 = r13.t;
        if (r1 != 0) goto L_0x0318;
    L_0x0315:
        if (r15 == 0) goto L_0x0318;
    L_0x0317:
        goto L_0x0322;
    L_0x0318:
        if (r1 != 0) goto L_0x031b;
    L_0x031a:
        goto L_0x0326;
    L_0x031b:
        r1 = r1.equals(r15);
        if (r1 == 0) goto L_0x0322;
    L_0x0321:
        goto L_0x0326;
    L_0x0322:
        r13.t = r15;
        r0 = r0 | 64;
    L_0x0326:
        r15 = "breakInfo";
        r15 = r14.has(r15);
        if (r15 == 0) goto L_0x033e;
    L_0x032e:
        r15 = r13.a;
        if (r15 == 0) goto L_0x033e;
    L_0x0332:
        r1 = "breakInfo";
        r14 = r14.getJSONObject(r1);
        r15.a(r14);
        r14 = r0 | 2;
        return r14;
    L_0x033e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pjz.a(org.json.JSONObject, int):int");
    }

    public final pjy a(int i) {
        Integer num = (Integer) this.u.get(i);
        return num != null ? (pjy) this.n.get(num.intValue()) : null;
    }

    public final Integer b(int i) {
        return (Integer) this.u.get(i);
    }

    private final void a(pjy[] pjyArr) {
        this.n.clear();
        this.u.clear();
        for (int i = 0; i < pjyArr.length; i++) {
            Object obj = pjyArr[i];
            this.n.add(obj);
            this.u.put(obj.b, Integer.valueOf(i));
        }
    }

    /* JADX WARNING: Missing block: B:48:0x00a0, code skipped:
            if (defpackage.qbg.a(r1, r3) == false) goto L_0x00a9;
     */
    public final boolean equals(java.lang.Object r8) {
        /*
        r7 = this;
        r0 = 1;
        if (r7 == r8) goto L_0x00aa;
    L_0x0003:
        r1 = r8 instanceof defpackage.pjz;
        r2 = 0;
        if (r1 == 0) goto L_0x00a9;
    L_0x0008:
        r8 = (defpackage.pjz) r8;
        r1 = r7.r;
        if (r1 == 0) goto L_0x0010;
    L_0x000e:
        r1 = 0;
        goto L_0x0011;
    L_0x0010:
        r1 = 1;
    L_0x0011:
        r3 = r8.r;
        if (r3 == 0) goto L_0x0017;
    L_0x0015:
        r3 = 0;
        goto L_0x0018;
    L_0x0017:
        r3 = 1;
    L_0x0018:
        if (r1 != r3) goto L_0x00a9;
    L_0x001a:
        r3 = r7.b;
        r5 = r8.b;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 != 0) goto L_0x00a9;
    L_0x0022:
        r1 = r7.c;
        r3 = r8.c;
        if (r1 != r3) goto L_0x00a9;
    L_0x0028:
        r3 = r7.d;
        r5 = r8.d;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 != 0) goto L_0x00a9;
    L_0x0030:
        r1 = r7.e;
        r3 = r8.e;
        if (r1 != r3) goto L_0x00a9;
    L_0x0036:
        r1 = r7.f;
        r3 = r8.f;
        if (r1 != r3) goto L_0x00a9;
    L_0x003c:
        r3 = r7.g;
        r5 = r8.g;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 != 0) goto L_0x00a9;
    L_0x0044:
        r3 = r7.h;
        r5 = r8.h;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 != 0) goto L_0x00a9;
    L_0x004c:
        r1 = r7.i;
        r3 = r8.i;
        if (r1 != r3) goto L_0x00a9;
    L_0x0052:
        r1 = r7.k;
        r3 = r8.k;
        if (r1 != r3) goto L_0x00a9;
    L_0x0058:
        r1 = r7.l;
        r3 = r8.l;
        if (r1 != r3) goto L_0x00a9;
    L_0x005e:
        r1 = r7.m;
        r3 = r8.m;
        if (r1 != r3) goto L_0x00a9;
    L_0x0064:
        r1 = r7.j;
        r3 = r8.j;
        r1 = java.util.Arrays.equals(r1, r3);
        if (r1 == 0) goto L_0x00a9;
    L_0x006e:
        r3 = r7.p;
        r1 = java.lang.Long.valueOf(r3);
        r3 = r8.p;
        r3 = java.lang.Long.valueOf(r3);
        r1 = defpackage.ppj.a(r1, r3);
        if (r1 == 0) goto L_0x00a9;
    L_0x0080:
        r1 = r7.n;
        r3 = r8.n;
        r1 = defpackage.ppj.a(r1, r3);
        if (r1 == 0) goto L_0x00a9;
    L_0x008a:
        r1 = r7.a;
        r3 = r8.a;
        r1 = defpackage.ppj.a(r1, r3);
        if (r1 == 0) goto L_0x00a9;
    L_0x0094:
        r1 = r7.r;
        if (r1 == 0) goto L_0x00a2;
    L_0x0098:
        r3 = r8.r;
        if (r3 == 0) goto L_0x00a2;
    L_0x009c:
        r1 = defpackage.qbg.a(r1, r3);
        if (r1 == 0) goto L_0x00a9;
    L_0x00a2:
        r1 = r7.o;
        r8 = r8.o;
        if (r1 != r8) goto L_0x00a9;
    L_0x00a8:
        return r0;
    L_0x00a9:
        return r2;
    L_0x00aa:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pjz.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.p), Double.valueOf(this.h), Boolean.valueOf(this.i), Integer.valueOf(Arrays.hashCode(this.j)), Integer.valueOf(this.k), Integer.valueOf(this.l), String.valueOf(this.r), Integer.valueOf(this.m), this.n, Boolean.valueOf(this.o)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.r;
        this.q = jSONObject != null ? jSONObject.toString() : null;
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.a, i);
        qov.a(parcel, 3, this.b);
        qov.b(parcel, 4, this.c);
        qov.a(parcel, 5, this.d);
        qov.b(parcel, 6, this.e);
        qov.b(parcel, 7, this.f);
        qov.a(parcel, 8, this.g);
        qov.a(parcel, 9, this.p);
        qov.a(parcel, 10, this.h);
        qov.a(parcel, 11, this.i);
        qov.a(parcel, 12, this.j);
        qov.b(parcel, 13, this.k);
        qov.b(parcel, 14, this.l);
        qov.a(parcel, 15, this.q);
        qov.b(parcel, 16, this.m);
        qov.b(parcel, 17, this.n);
        qov.a(parcel, 18, this.o);
        qov.a(parcel, 19, this.s, i);
        qov.a(parcel, 20, this.t, i);
        qov.a(parcel, a);
    }
}
