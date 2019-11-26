package defpackage;

import android.os.SystemClock;
import com.google.android.gms.cast.MediaInfo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pom */
public final class pom extends pox {
    private static final String k = ppj.b("com.google.cast.media");
    public pjz a;
    public poo b;
    public final pos c = new pos(86400000);
    public final pos d = new pos(86400000);
    public final pos e = new pos(86400000);
    public final pos f = new pos(86400000);
    public final pos g = new pos(86400000);
    private long l;
    private final pos m = new pos(86400000);
    private final pos n = new pos(86400000);
    private final pos o = new pos(86400000);
    private final pos p = new pos(10000);
    private final pos q = new pos(86400000);
    private final pos r = new pos(86400000);
    private final pos s = new pos(86400000);
    private final pos t = new pos(86400000);
    private final pos u = new pos(86400000);
    private final pos v = new pos(86400000);
    private final pos w = new pos(86400000);
    private final pos x = new pos(86400000);
    private final pos y = new pos(86400000);

    public pom() {
        super(k, "MediaControlChannel");
        a(this.c);
        a(this.m);
        a(this.n);
        a(this.o);
        a(this.p);
        a(this.q);
        a(this.r);
        a(this.s);
        a(this.d);
        a(this.e);
        a(this.t);
        a(this.u);
        a(this.v);
        a(this.w);
        a(this.f);
        a(this.x);
        a(this.x);
        a(this.y);
        k();
    }

    public final long a(pot pot) {
        JSONObject jSONObject = new JSONObject();
        long f = f();
        this.m.a(f, pot);
        try {
            jSONObject.put("requestId", f);
            jSONObject.put("type", "PAUSE");
            jSONObject.put("mediaSessionId", d());
        } catch (JSONException unused) {
        }
        a(jSONObject.toString(), f);
        return f;
    }

    public final long b(pot pot) {
        JSONObject jSONObject = new JSONObject();
        long f = f();
        this.n.a(f, pot);
        try {
            jSONObject.put("requestId", f);
            jSONObject.put("type", "PLAY");
            jSONObject.put("mediaSessionId", d());
        } catch (JSONException unused) {
        }
        a(jSONObject.toString(), f);
        return f;
    }

    public final long a(pot pot, long j, int i) {
        JSONObject jSONObject = new JSONObject();
        long f = f();
        this.p.a(f, new pop(this, pot));
        try {
            jSONObject.put("requestId", f);
            jSONObject.put("type", "SEEK");
            jSONObject.put("mediaSessionId", d());
            String str = "currentTime";
            double d = (double) j;
            Double.isNaN(d);
            jSONObject.put(str, d / 1000.0d);
            String str2 = "resumeState";
            if (i == 1) {
                jSONObject.put(str2, "PLAYBACK_START");
            } else if (i == 2) {
                jSONObject.put(str2, "PLAYBACK_PAUSE");
            }
        } catch (JSONException unused) {
        }
        a(jSONObject.toString(), f);
        return f;
    }

    public final long a(pot pot, double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            StringBuilder stringBuilder = new StringBuilder(41);
            stringBuilder.append("Volume cannot be ");
            stringBuilder.append(d);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        JSONObject jSONObject = new JSONObject();
        long f = f();
        this.q.a(f, pot);
        try {
            jSONObject.put("requestId", f);
            jSONObject.put("type", "SET_VOLUME");
            jSONObject.put("mediaSessionId", d());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("level", d);
            jSONObject.put("volume", jSONObject2);
        } catch (JSONException unused) {
        }
        a(jSONObject.toString(), f);
        return f;
    }

    public final long c(pot pot) {
        return a(pot, true);
    }

    public final long a(pot pot, boolean z) {
        JSONObject jSONObject = new JSONObject();
        long f = f();
        if (z) {
            this.s.a(f, pot);
        }
        try {
            jSONObject.put("requestId", f);
            jSONObject.put("type", "GET_STATUS");
            pjz pjz = this.a;
            if (pjz != null) {
                jSONObject.put("mediaSessionId", pjz.b);
            }
        } catch (JSONException unused) {
        }
        a(jSONObject.toString(), f);
        return f;
    }

    public final long a() {
        MediaInfo c = c();
        long j = 0;
        if (c == null || this.l == 0) {
            return 0;
        }
        pjz pjz = this.a;
        double d = pjz.d;
        long j2 = pjz.g;
        int i = pjz.e;
        if (d == 0.0d || i != 2) {
            return j2;
        }
        long j3 = c.e;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.l;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime != 0) {
            double d2 = (double) elapsedRealtime;
            Double.isNaN(d2);
            long j4 = ((long) (d2 * d)) + j2;
            if (j3 > 0 && j4 > j3) {
                j4 = j3;
            } else if (j4 >= 0) {
                return j4;
            }
            return j4;
        }
        j = j2;
        return j;
    }

    public final long b() {
        MediaInfo c = c();
        if (c == null) {
            return 0;
        }
        return c.e;
    }

    public final MediaInfo c() {
        pjz pjz = this.a;
        return pjz != null ? pjz.a : null;
    }

    public final long a(pot pot, int i) {
        JSONObject jSONObject = new JSONObject();
        long f = f();
        this.u.a(f, pot);
        try {
            jSONObject.put("requestId", f);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", d());
            if (i != 0) {
                jSONObject.put("jump", i);
            }
        } catch (JSONException unused) {
        }
        a(jSONObject.toString(), f);
        return f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:139:0x0232 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x023f A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x024d A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x024c A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0255 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0254 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x025d A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x025c A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0265 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0264 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0276 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x028b A:{LOOP_END, Catch:{ JSONException -> 0x02aa }, LOOP:3: B:165:0x0285->B:167:0x028b} */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x020e A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x020c A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0211 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0215 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0232 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x023f A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x024c A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x024d A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0254 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0255 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x025c A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x025d A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0264 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0265 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0276 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x028b A:{LOOP_END, Catch:{ JSONException -> 0x02aa }, LOOP:3: B:165:0x0285->B:167:0x028b} */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x020c A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x020e A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0211 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0215 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0232 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x023f A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x024d A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x024c A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0255 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0254 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x025d A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x025c A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0265 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0264 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0276 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x028b A:{LOOP_END, Catch:{ JSONException -> 0x02aa }, LOOP:3: B:165:0x0285->B:167:0x028b} */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01ed A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x020e A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x020c A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0211 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0215 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0232 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x023f A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x024c A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x024d A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0254 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0255 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x025c A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x025d A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0264 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0265 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0276 A:{Catch:{ JSONException -> 0x02aa }} */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x028b A:{LOOP_END, Catch:{ JSONException -> 0x02aa }, LOOP:3: B:165:0x0285->B:167:0x028b} */
    public final void a(java.lang.String r15) {
        /*
        r14 = this;
        r0 = r14.i;
        r1 = 1;
        r2 = new java.lang.Object[r1];
        r3 = 0;
        r2[r3] = r15;
        r4 = "message received: %s";
        r0.a(r4, r2);
        r0 = 2;
        r2 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x02aa }
        r2.<init>(r15);	 Catch:{ JSONException -> 0x02aa }
        r4 = "type";
        r4 = r2.getString(r4);	 Catch:{ JSONException -> 0x02aa }
        r5 = "requestId";
        r6 = -1;
        r5 = r2.optLong(r5, r6);	 Catch:{ JSONException -> 0x02aa }
        r7 = r4.hashCode();	 Catch:{ JSONException -> 0x02aa }
        r8 = 4;
        r9 = 3;
        r10 = -1;
        switch(r7) {
            case -1830647528: goto L_0x007b;
            case -1790231854: goto L_0x0070;
            case -1125000185: goto L_0x0065;
            case -262628938: goto L_0x005a;
            case 154411710: goto L_0x004f;
            case 431600379: goto L_0x0044;
            case 823510221: goto L_0x0039;
            case 2107149050: goto L_0x002e;
            default: goto L_0x002b;
        };	 Catch:{ JSONException -> 0x02aa }
    L_0x002b:
        r4 = -1;
        goto L_0x0085;
    L_0x002e:
        r7 = "QUEUE_ITEM_IDS";
        r4 = r4.equals(r7);	 Catch:{ JSONException -> 0x02aa }
        if (r4 != 0) goto L_0x0037;
    L_0x0036:
        goto L_0x002b;
    L_0x0037:
        r4 = 5;
        goto L_0x0085;
    L_0x0039:
        r7 = "MEDIA_STATUS";
        r4 = r4.equals(r7);	 Catch:{ JSONException -> 0x02aa }
        if (r4 != 0) goto L_0x0042;
    L_0x0041:
        goto L_0x002b;
    L_0x0042:
        r4 = 0;
        goto L_0x0085;
    L_0x0044:
        r7 = "INVALID_PLAYER_STATE";
        r4 = r4.equals(r7);	 Catch:{ JSONException -> 0x02aa }
        if (r4 != 0) goto L_0x004d;
    L_0x004c:
        goto L_0x002b;
    L_0x004d:
        r4 = 1;
        goto L_0x0085;
    L_0x004f:
        r7 = "QUEUE_CHANGE";
        r4 = r4.equals(r7);	 Catch:{ JSONException -> 0x02aa }
        if (r4 != 0) goto L_0x0058;
    L_0x0057:
        goto L_0x002b;
    L_0x0058:
        r4 = 6;
        goto L_0x0085;
    L_0x005a:
        r7 = "LOAD_FAILED";
        r4 = r4.equals(r7);	 Catch:{ JSONException -> 0x02aa }
        if (r4 != 0) goto L_0x0063;
    L_0x0062:
        goto L_0x002b;
    L_0x0063:
        r4 = 2;
        goto L_0x0085;
    L_0x0065:
        r7 = "INVALID_REQUEST";
        r4 = r4.equals(r7);	 Catch:{ JSONException -> 0x02aa }
        if (r4 != 0) goto L_0x006e;
    L_0x006d:
        goto L_0x002b;
    L_0x006e:
        r4 = 4;
        goto L_0x0085;
    L_0x0070:
        r7 = "QUEUE_ITEMS";
        r4 = r4.equals(r7);	 Catch:{ JSONException -> 0x02aa }
        if (r4 != 0) goto L_0x0079;
    L_0x0078:
        goto L_0x002b;
    L_0x0079:
        r4 = 7;
        goto L_0x0085;
    L_0x007b:
        r7 = "LOAD_CANCELLED";
        r4 = r4.equals(r7);	 Catch:{ JSONException -> 0x02aa }
        if (r4 != 0) goto L_0x0084;
    L_0x0083:
        goto L_0x002b;
    L_0x0084:
        r4 = 3;
    L_0x0085:
        r7 = "itemIds";
        r11 = 2100; // 0x834 float:2.943E-42 double:1.0375E-320;
        r12 = "customData";
        r13 = 0;
        switch(r4) {
            case 0: goto L_0x01bb;
            case 1: goto L_0x0197;
            case 2: goto L_0x018d;
            case 3: goto L_0x0181;
            case 4: goto L_0x015d;
            case 5: goto L_0x0144;
            case 6: goto L_0x00c6;
            case 7: goto L_0x0091;
            default: goto L_0x008f;
        };
    L_0x008f:
        goto L_0x02a9;
    L_0x0091:
        r4 = r14.g;	 Catch:{ JSONException -> 0x02aa }
        r4.a(r5, r3, r13);	 Catch:{ JSONException -> 0x02aa }
        r4 = r14.b;	 Catch:{ JSONException -> 0x02aa }
        if (r4 == 0) goto L_0x02a9;
    L_0x009a:
        r4 = "items";
        r2 = r2.getJSONArray(r4);	 Catch:{ JSONException -> 0x02aa }
        r4 = r2.length();	 Catch:{ JSONException -> 0x02aa }
        r4 = new defpackage.pjy[r4];	 Catch:{ JSONException -> 0x02aa }
        r5 = 0;
    L_0x00a7:
        r6 = r2.length();	 Catch:{ JSONException -> 0x02aa }
        if (r5 >= r6) goto L_0x00bf;
    L_0x00ad:
        r6 = new pjx;	 Catch:{ JSONException -> 0x02aa }
        r7 = r2.getJSONObject(r5);	 Catch:{ JSONException -> 0x02aa }
        r6.<init>(r7);	 Catch:{ JSONException -> 0x02aa }
        r6 = r6.a();	 Catch:{ JSONException -> 0x02aa }
        r4[r5] = r6;	 Catch:{ JSONException -> 0x02aa }
        r5 = r5 + 1;
        goto L_0x00a7;
    L_0x00bf:
        r2 = r14.b;	 Catch:{ JSONException -> 0x02aa }
        r2.a(r4);	 Catch:{ JSONException -> 0x02aa }
        goto L_0x02a9;
    L_0x00c6:
        r4 = r14.x;	 Catch:{ JSONException -> 0x02aa }
        r4.a(r5, r3, r13);	 Catch:{ JSONException -> 0x02aa }
        r4 = r14.b;	 Catch:{ JSONException -> 0x02aa }
        if (r4 == 0) goto L_0x0143;
    L_0x00cf:
        r4 = "changeType";
        r4 = r2.getString(r4);	 Catch:{ JSONException -> 0x02aa }
        r5 = r2.getJSONArray(r7);	 Catch:{ JSONException -> 0x02aa }
        r5 = defpackage.pom.a(r5);	 Catch:{ JSONException -> 0x02aa }
        r6 = "insertBefore";
        r2 = r2.optInt(r6, r3);	 Catch:{ JSONException -> 0x02aa }
        if (r5 == 0) goto L_0x0143;
    L_0x00e5:
        r6 = r4.hashCode();	 Catch:{ JSONException -> 0x02aa }
        switch(r6) {
            case -2130463047: goto L_0x0119;
            case -1881281404: goto L_0x010e;
            case -1785516855: goto L_0x0103;
            case 1122976047: goto L_0x00f8;
            case 1395699694: goto L_0x00ed;
            default: goto L_0x00ec;
        };	 Catch:{ JSONException -> 0x02aa }
    L_0x00ec:
        goto L_0x0123;
    L_0x00ed:
        r6 = "NO_CHANGE";
        r4 = r4.equals(r6);	 Catch:{ JSONException -> 0x02aa }
        if (r4 != 0) goto L_0x00f6;
    L_0x00f5:
        goto L_0x0123;
    L_0x00f6:
        r10 = 4;
        goto L_0x0123;
    L_0x00f8:
        r6 = "ITEMS_CHANGE";
        r4 = r4.equals(r6);	 Catch:{ JSONException -> 0x02aa }
        if (r4 != 0) goto L_0x0101;
    L_0x0100:
        goto L_0x0123;
    L_0x0101:
        r10 = 1;
        goto L_0x0123;
    L_0x0103:
        r6 = "UPDATE";
        r4 = r4.equals(r6);	 Catch:{ JSONException -> 0x02aa }
        if (r4 != 0) goto L_0x010c;
    L_0x010b:
        goto L_0x0123;
    L_0x010c:
        r10 = 3;
        goto L_0x0123;
    L_0x010e:
        r6 = "REMOVE";
        r4 = r4.equals(r6);	 Catch:{ JSONException -> 0x02aa }
        if (r4 != 0) goto L_0x0117;
    L_0x0116:
        goto L_0x0123;
    L_0x0117:
        r10 = 2;
        goto L_0x0123;
    L_0x0119:
        r6 = "INSERT";
        r4 = r4.equals(r6);	 Catch:{ JSONException -> 0x02aa }
        if (r4 != 0) goto L_0x0122;
    L_0x0121:
        goto L_0x0123;
    L_0x0122:
        r10 = 0;
    L_0x0123:
        if (r10 == 0) goto L_0x013e;
    L_0x0125:
        if (r10 == r1) goto L_0x0138;
    L_0x0127:
        if (r10 == r0) goto L_0x0132;
    L_0x0129:
        if (r10 == r9) goto L_0x012c;
    L_0x012b:
        goto L_0x0143;
    L_0x012c:
        r2 = r14.b;	 Catch:{ JSONException -> 0x02aa }
        r2.a(r5);	 Catch:{ JSONException -> 0x02aa }
        goto L_0x0143;
    L_0x0132:
        r2 = r14.b;	 Catch:{ JSONException -> 0x02aa }
        r2.c(r5);	 Catch:{ JSONException -> 0x02aa }
        return;
    L_0x0138:
        r2 = r14.b;	 Catch:{ JSONException -> 0x02aa }
        r2.b(r5);	 Catch:{ JSONException -> 0x02aa }
        return;
    L_0x013e:
        r4 = r14.b;	 Catch:{ JSONException -> 0x02aa }
        r4.a(r5, r2);	 Catch:{ JSONException -> 0x02aa }
    L_0x0143:
        return;
    L_0x0144:
        r4 = r14.f;	 Catch:{ JSONException -> 0x02aa }
        r4.a(r5, r3, r13);	 Catch:{ JSONException -> 0x02aa }
        r4 = r14.b;	 Catch:{ JSONException -> 0x02aa }
        if (r4 == 0) goto L_0x015c;
    L_0x014d:
        r2 = r2.getJSONArray(r7);	 Catch:{ JSONException -> 0x02aa }
        r2 = defpackage.pom.a(r2);	 Catch:{ JSONException -> 0x02aa }
        if (r2 == 0) goto L_0x015c;
    L_0x0157:
        r4 = r14.b;	 Catch:{ JSONException -> 0x02aa }
        r4.a(r2);	 Catch:{ JSONException -> 0x02aa }
    L_0x015c:
        return;
    L_0x015d:
        r4 = r14.i;	 Catch:{ JSONException -> 0x02aa }
        r7 = "received unexpected error: Invalid Request.";
        r8 = new java.lang.Object[r3];	 Catch:{ JSONException -> 0x02aa }
        r4.c(r7, r8);	 Catch:{ JSONException -> 0x02aa }
        r2 = r2.optJSONObject(r12);	 Catch:{ JSONException -> 0x02aa }
        r4 = r14.h;	 Catch:{ JSONException -> 0x02aa }
        r4 = r4.iterator();	 Catch:{ JSONException -> 0x02aa }
    L_0x0170:
        r7 = r4.hasNext();	 Catch:{ JSONException -> 0x02aa }
        if (r7 == 0) goto L_0x0180;
    L_0x0176:
        r7 = r4.next();	 Catch:{ JSONException -> 0x02aa }
        r7 = (defpackage.pos) r7;	 Catch:{ JSONException -> 0x02aa }
        r7.a(r5, r11, r2);	 Catch:{ JSONException -> 0x02aa }
        goto L_0x0170;
    L_0x0180:
        return;
    L_0x0181:
        r2 = r2.optJSONObject(r12);	 Catch:{ JSONException -> 0x02aa }
        r4 = r14.c;	 Catch:{ JSONException -> 0x02aa }
        r7 = 2101; // 0x835 float:2.944E-42 double:1.038E-320;
        r4.a(r5, r7, r2);	 Catch:{ JSONException -> 0x02aa }
        return;
    L_0x018d:
        r2 = r2.optJSONObject(r12);	 Catch:{ JSONException -> 0x02aa }
        r4 = r14.c;	 Catch:{ JSONException -> 0x02aa }
        r4.a(r5, r11, r2);	 Catch:{ JSONException -> 0x02aa }
        return;
    L_0x0197:
        r4 = r14.i;	 Catch:{ JSONException -> 0x02aa }
        r7 = "received unexpected error: Invalid Player State.";
        r8 = new java.lang.Object[r3];	 Catch:{ JSONException -> 0x02aa }
        r4.c(r7, r8);	 Catch:{ JSONException -> 0x02aa }
        r2 = r2.optJSONObject(r12);	 Catch:{ JSONException -> 0x02aa }
        r4 = r14.h;	 Catch:{ JSONException -> 0x02aa }
        r4 = r4.iterator();	 Catch:{ JSONException -> 0x02aa }
    L_0x01aa:
        r7 = r4.hasNext();	 Catch:{ JSONException -> 0x02aa }
        if (r7 == 0) goto L_0x01ba;
    L_0x01b0:
        r7 = r4.next();	 Catch:{ JSONException -> 0x02aa }
        r7 = (defpackage.pos) r7;	 Catch:{ JSONException -> 0x02aa }
        r7.a(r5, r11, r2);	 Catch:{ JSONException -> 0x02aa }
        goto L_0x01aa;
    L_0x01ba:
        return;
    L_0x01bb:
        r4 = "status";
        r2 = r2.getJSONArray(r4);	 Catch:{ JSONException -> 0x02aa }
        r4 = r2.length();	 Catch:{ JSONException -> 0x02aa }
        if (r4 <= 0) goto L_0x0296;
    L_0x01c7:
        r2 = r2.getJSONObject(r3);	 Catch:{ JSONException -> 0x02aa }
        r4 = r14.c;	 Catch:{ JSONException -> 0x02aa }
        r4 = r4.a(r5);	 Catch:{ JSONException -> 0x02aa }
        r7 = r14.p;	 Catch:{ JSONException -> 0x02aa }
        r7 = r7.a();	 Catch:{ JSONException -> 0x02aa }
        if (r7 == 0) goto L_0x01e4;
    L_0x01d9:
        r7 = r14.p;	 Catch:{ JSONException -> 0x02aa }
        r7 = r7.a(r5);	 Catch:{ JSONException -> 0x02aa }
        if (r7 == 0) goto L_0x01e2;
    L_0x01e1:
        goto L_0x01e4;
    L_0x01e2:
        r7 = 1;
        goto L_0x01e5;
    L_0x01e4:
        r7 = 0;
    L_0x01e5:
        r8 = r14.q;	 Catch:{ JSONException -> 0x02aa }
        r8 = r8.a();	 Catch:{ JSONException -> 0x02aa }
        if (r8 == 0) goto L_0x01f8;
    L_0x01ed:
        r8 = r14.q;	 Catch:{ JSONException -> 0x02aa }
        r8 = r8.a(r5);	 Catch:{ JSONException -> 0x02aa }
        if (r8 == 0) goto L_0x01f6;
    L_0x01f5:
        goto L_0x01f8;
    L_0x01f6:
        r8 = 1;
        goto L_0x020a;
    L_0x01f8:
        r8 = r14.r;	 Catch:{ JSONException -> 0x02aa }
        r8 = r8.a();	 Catch:{ JSONException -> 0x02aa }
        if (r8 == 0) goto L_0x0209;
    L_0x0200:
        r8 = r14.r;	 Catch:{ JSONException -> 0x02aa }
        r8 = r8.a(r5);	 Catch:{ JSONException -> 0x02aa }
        if (r8 != 0) goto L_0x0209;
    L_0x0208:
        goto L_0x01f6;
    L_0x0209:
        r8 = 0;
    L_0x020a:
        if (r7 != 0) goto L_0x020e;
    L_0x020c:
        r7 = 0;
        goto L_0x020f;
    L_0x020e:
        r7 = 2;
    L_0x020f:
        if (r8 == 0) goto L_0x0213;
    L_0x0211:
        r7 = r7 | 1;
    L_0x0213:
        if (r4 != 0) goto L_0x021f;
    L_0x0215:
        r4 = r14.a;	 Catch:{ JSONException -> 0x02aa }
        if (r4 != 0) goto L_0x021a;
    L_0x0219:
        goto L_0x021f;
    L_0x021a:
        r2 = r4.a(r2, r7);	 Catch:{ JSONException -> 0x02aa }
        goto L_0x022e;
    L_0x021f:
        r4 = new pjz;	 Catch:{ JSONException -> 0x02aa }
        r4.<init>(r2);	 Catch:{ JSONException -> 0x02aa }
        r14.a = r4;	 Catch:{ JSONException -> 0x02aa }
        r7 = android.os.SystemClock.elapsedRealtime();	 Catch:{ JSONException -> 0x02aa }
        r14.l = r7;	 Catch:{ JSONException -> 0x02aa }
        r2 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
    L_0x022e:
        r4 = r2 & 1;
        if (r4 == 0) goto L_0x023b;
    L_0x0232:
        r7 = android.os.SystemClock.elapsedRealtime();	 Catch:{ JSONException -> 0x02aa }
        r14.l = r7;	 Catch:{ JSONException -> 0x02aa }
        r14.g();	 Catch:{ JSONException -> 0x02aa }
    L_0x023b:
        r4 = r2 & 2;
        if (r4 == 0) goto L_0x0248;
    L_0x023f:
        r7 = android.os.SystemClock.elapsedRealtime();	 Catch:{ JSONException -> 0x02aa }
        r14.l = r7;	 Catch:{ JSONException -> 0x02aa }
        r14.g();	 Catch:{ JSONException -> 0x02aa }
    L_0x0248:
        r4 = r2 & 4;
        if (r4 != 0) goto L_0x024d;
    L_0x024c:
        goto L_0x0250;
    L_0x024d:
        r14.h();	 Catch:{ JSONException -> 0x02aa }
    L_0x0250:
        r4 = r2 & 8;
        if (r4 != 0) goto L_0x0255;
    L_0x0254:
        goto L_0x0258;
    L_0x0255:
        r14.i();	 Catch:{ JSONException -> 0x02aa }
    L_0x0258:
        r4 = r2 & 16;
        if (r4 != 0) goto L_0x025d;
    L_0x025c:
        goto L_0x0260;
    L_0x025d:
        r14.j();	 Catch:{ JSONException -> 0x02aa }
    L_0x0260:
        r4 = r2 & 32;
        if (r4 != 0) goto L_0x0265;
    L_0x0264:
        goto L_0x0272;
    L_0x0265:
        r7 = android.os.SystemClock.elapsedRealtime();	 Catch:{ JSONException -> 0x02aa }
        r14.l = r7;	 Catch:{ JSONException -> 0x02aa }
        r4 = r14.b;	 Catch:{ JSONException -> 0x02aa }
        if (r4 == 0) goto L_0x0272;
    L_0x026f:
        r4.e();	 Catch:{ JSONException -> 0x02aa }
    L_0x0272:
        r2 = r2 & 64;
        if (r2 == 0) goto L_0x027f;
    L_0x0276:
        r7 = android.os.SystemClock.elapsedRealtime();	 Catch:{ JSONException -> 0x02aa }
        r14.l = r7;	 Catch:{ JSONException -> 0x02aa }
        r14.g();	 Catch:{ JSONException -> 0x02aa }
    L_0x027f:
        r2 = r14.h;	 Catch:{ JSONException -> 0x02aa }
        r2 = r2.iterator();	 Catch:{ JSONException -> 0x02aa }
    L_0x0285:
        r4 = r2.hasNext();	 Catch:{ JSONException -> 0x02aa }
        if (r4 == 0) goto L_0x0295;
    L_0x028b:
        r4 = r2.next();	 Catch:{ JSONException -> 0x02aa }
        r4 = (defpackage.pos) r4;	 Catch:{ JSONException -> 0x02aa }
        r4.a(r5, r3, r13);	 Catch:{ JSONException -> 0x02aa }
        goto L_0x0285;
    L_0x0295:
        return;
    L_0x0296:
        r14.a = r13;	 Catch:{ JSONException -> 0x02aa }
        r14.g();	 Catch:{ JSONException -> 0x02aa }
        r14.h();	 Catch:{ JSONException -> 0x02aa }
        r14.i();	 Catch:{ JSONException -> 0x02aa }
        r14.j();	 Catch:{ JSONException -> 0x02aa }
        r2 = r14.s;	 Catch:{ JSONException -> 0x02aa }
        r2.a(r5, r3, r13);	 Catch:{ JSONException -> 0x02aa }
    L_0x02a9:
        return;
    L_0x02aa:
        r2 = move-exception;
        r4 = r14.i;
        r0 = new java.lang.Object[r0];
        r2 = r2.getMessage();
        r0[r3] = r2;
        r0[r1] = r15;
        r15 = "Message is malformed (%s); ignoring: %s";
        r4.c(r15, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pom.a(java.lang.String):void");
    }

    private static int[] a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    public final long d() {
        pjz pjz = this.a;
        if (pjz != null) {
            return pjz.b;
        }
        throw new por();
    }

    private final void g() {
        poo poo = this.b;
        if (poo != null) {
            poo.a();
        }
    }

    private final void h() {
        poo poo = this.b;
        if (poo != null) {
            poo.b();
        }
    }

    private final void i() {
        poo poo = this.b;
        if (poo != null) {
            poo.c();
        }
    }

    private final void j() {
        poo poo = this.b;
        if (poo != null) {
            poo.d();
        }
    }

    private final void k() {
        this.l = 0;
        this.a = null;
        for (pos b : this.h) {
            b.b();
        }
    }

    public final void e() {
        super.e();
        k();
    }

    public final void a(long j, int i) {
        for (pos a : this.h) {
            a.a(j, i, null);
        }
    }
}
