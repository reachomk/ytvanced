package defpackage;

import android.media.MediaDrm;
import android.media.MediaDrm.ProvisionRequest;
import android.media.UnsupportedSchemeException;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: oef */
public final class oef implements oea {
    public final MediaDrm a;
    private final UUID b;

    public static oef a(UUID uuid) {
        try {
            return new oef(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new oem(1, e);
        } catch (Exception e2) {
            throw new oem(2, e2);
        }
    }

    private oef(UUID uuid) {
        oxz.a((Object) uuid);
        oxz.a(nyr.b.equals(uuid) ^ 1, (Object) "Use C.CLEARKEY_UUID instead");
        this.b = uuid;
        this.a = new MediaDrm(oef.b(uuid));
        if (nyr.d.equals(uuid)) {
            if ("ASUS_Z00AD".equals(ozp.d)) {
                this.a.setPropertyString("securityLevel", "L3");
            }
        }
    }

    public final byte[] a() {
        return this.a.openSession();
    }

    public final void a(byte[] bArr) {
        this.a.closeSession(bArr);
    }

    /* JADX WARNING: Missing block: B:74:0x01ef, code skipped:
            if ("AFTM".equals(defpackage.ozp.d) != false) goto L_0x01f1;
     */
    /* JADX WARNING: Missing block: B:76:0x01f5, code skipped:
            if (r1 == null) goto L_0x01f7;
     */
    public final defpackage.odz a(byte[] r15, java.util.List r16, int r17, java.util.HashMap r18) {
        /*
        r14 = this;
        r0 = r14;
        r1 = r16;
        r2 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0006:
        r6 = r2;
        r7 = r6;
        goto L_0x0220;
    L_0x000a:
        r2 = r0.b;
        r3 = defpackage.nyr.d;
        r2 = r3.equals(r2);
        r3 = 1;
        r4 = 0;
        if (r2 != 0) goto L_0x001f;
    L_0x0016:
        r1 = r1.get(r4);
        r1 = (defpackage.ods) r1;
    L_0x001c:
        r2 = r1;
        goto L_0x00ca;
    L_0x001f:
        r2 = defpackage.ozp.a;
        r5 = 28;
        if (r2 < r5) goto L_0x0093;
    L_0x0025:
        r2 = r16.size();
        if (r2 <= r3) goto L_0x0093;
    L_0x002b:
        r2 = r1.get(r4);
        r2 = (defpackage.ods) r2;
        r5 = 0;
        r6 = 0;
    L_0x0033:
        r7 = r16.size();
        if (r5 >= r7) goto L_0x0067;
    L_0x0039:
        r7 = r1.get(r5);
        r7 = (defpackage.ods) r7;
        r8 = r7.d;
        r8 = defpackage.ozp.a(r8);
        r8 = (byte[]) r8;
        r9 = r7.c;
        r10 = r2.c;
        r9 = defpackage.ozp.a(r9, r10);
        if (r9 == 0) goto L_0x0093;
    L_0x0051:
        r7 = r7.b;
        r9 = r2.b;
        r7 = defpackage.ozp.a(r7, r9);
        if (r7 != 0) goto L_0x005c;
    L_0x005b:
        goto L_0x0093;
    L_0x005c:
        r7 = defpackage.ohs.b(r8);
        if (r7 == 0) goto L_0x0093;
    L_0x0062:
        r7 = r8.length;
        r6 = r6 + r7;
        r5 = r5 + 1;
        goto L_0x0033;
    L_0x0067:
        r5 = new byte[r6];
        r6 = 0;
        r7 = 0;
    L_0x006b:
        r8 = r16.size();
        if (r6 >= r8) goto L_0x0087;
    L_0x0071:
        r8 = r1.get(r6);
        r8 = (defpackage.ods) r8;
        r8 = r8.d;
        r8 = defpackage.ozp.a(r8);
        r8 = (byte[]) r8;
        r9 = r8.length;
        java.lang.System.arraycopy(r8, r4, r5, r7, r9);
        r7 = r7 + r9;
        r6 = r6 + 1;
        goto L_0x006b;
    L_0x0087:
        r1 = new ods;
        r6 = r2.a;
        r7 = r2.b;
        r2 = r2.c;
        r1.<init>(r6, r7, r2, r5);
        goto L_0x001c;
    L_0x0093:
        r2 = 0;
    L_0x0094:
        r5 = r16.size();
        if (r2 >= r5) goto L_0x00c2;
    L_0x009a:
        r5 = r1.get(r2);
        r5 = (defpackage.ods) r5;
        r6 = r5.d;
        r6 = defpackage.ozp.a(r6);
        r6 = (byte[]) r6;
        r6 = defpackage.ohs.a(r6);
        r7 = defpackage.ozp.a;
        r8 = 23;
        if (r7 < r8) goto L_0x00b3;
    L_0x00b2:
        goto L_0x00b6;
    L_0x00b3:
        if (r6 != 0) goto L_0x00b6;
    L_0x00b5:
        goto L_0x00bd;
    L_0x00b6:
        r7 = defpackage.ozp.a;
        if (r7 >= r8) goto L_0x00bb;
    L_0x00ba:
        goto L_0x00bf;
    L_0x00bb:
        if (r6 != r3) goto L_0x00bf;
    L_0x00bd:
        r2 = r5;
        goto L_0x00ca;
    L_0x00bf:
        r2 = r2 + 1;
        goto L_0x0094;
    L_0x00c2:
        r1 = r1.get(r4);
        r1 = (defpackage.ods) r1;
        goto L_0x001c;
    L_0x00ca:
        r1 = r0.b;
        r5 = r2.d;
        r5 = defpackage.oxz.a(r5);
        r5 = (byte[]) r5;
        r6 = defpackage.nyr.e;
        r6 = r6.equals(r1);
        r7 = 26;
        if (r6 == 0) goto L_0x01b3;
    L_0x00de:
        r6 = defpackage.ohs.a(r5, r1);
        if (r6 == 0) goto L_0x00e5;
    L_0x00e4:
        r5 = r6;
    L_0x00e5:
        r6 = defpackage.nyr.e;
        r8 = new oza;
        r8.<init>(r5);
        r9 = r8.l();
        r10 = r8.g();
        r11 = r8.g();
        if (r10 == r3) goto L_0x00fc;
    L_0x00fa:
        goto L_0x0180;
    L_0x00fc:
        if (r11 == r3) goto L_0x0100;
    L_0x00fe:
        goto L_0x0180;
    L_0x0100:
        r10 = r8.g();
        r11 = "UTF-16LE";
        r12 = java.nio.charset.Charset.forName(r11);
        r8 = r8.a(r10, r12);
        r10 = "<LA_URL>";
        r10 = r8.contains(r10);
        if (r10 != 0) goto L_0x0180;
    L_0x0116:
        r5 = "</DATA>";
        r5 = r8.indexOf(r5);
        r10 = -1;
        if (r5 != r10) goto L_0x0126;
    L_0x011f:
        r10 = "FrameworkMediaDrm";
        r12 = "Could not find the </DATA> tag. Skipping LA_URL workaround.";
        defpackage.oyp.a(r10, r12);
    L_0x0126:
        r10 = r8.substring(r4, r5);
        r5 = r8.substring(r5);
        r8 = java.lang.String.valueOf(r10);
        r8 = r8.length();
        r12 = java.lang.String.valueOf(r5);
        r12 = r12.length();
        r13 = new java.lang.StringBuilder;
        r8 = r8 + r7;
        r8 = r8 + r12;
        r13.<init>(r8);
        r13.append(r10);
        r8 = "<LA_URL>https://x</LA_URL>";
        r13.append(r8);
        r13.append(r5);
        r5 = r13.toString();
        r9 = r9 + 52;
        r8 = java.nio.ByteBuffer.allocate(r9);
        r10 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r8.order(r10);
        r8.putInt(r9);
        r8.putShort(r3);
        r8.putShort(r3);
        r3 = r5.length();
        r3 = r3 + r3;
        r3 = (short) r3;
        r8.putShort(r3);
        r3 = java.nio.charset.Charset.forName(r11);
        r3 = r5.getBytes(r3);
        r8.put(r3);
        r5 = r8.array();
    L_0x0180:
        if (r5 == 0) goto L_0x0184;
    L_0x0182:
        r3 = r5.length;
        goto L_0x0185;
    L_0x0184:
        r3 = 0;
    L_0x0185:
        r3 = r3 + 32;
        r8 = java.nio.ByteBuffer.allocate(r3);
        r8.putInt(r3);
        r3 = defpackage.ogy.ah;
        r8.putInt(r3);
        r8.putInt(r4);
        r3 = r6.getMostSignificantBits();
        r8.putLong(r3);
        r3 = r6.getLeastSignificantBits();
        r8.putLong(r3);
        if (r5 == 0) goto L_0x01af;
    L_0x01a6:
        r3 = r5.length;
        if (r3 == 0) goto L_0x01af;
    L_0x01a9:
        r8.putInt(r3);
        r8.put(r5);
    L_0x01af:
        r5 = r8.array();
    L_0x01b3:
        r3 = defpackage.ozp.a;
        r4 = 21;
        if (r3 >= r4) goto L_0x01c1;
    L_0x01b9:
        r3 = defpackage.nyr.d;
        r3 = r3.equals(r1);
        if (r3 != 0) goto L_0x01f1;
    L_0x01c1:
        r3 = defpackage.nyr.e;
        r3 = r3.equals(r1);
        if (r3 == 0) goto L_0x01f7;
    L_0x01c9:
        r3 = defpackage.ozp.c;
        r4 = "Amazon";
        r3 = r4.equals(r3);
        if (r3 == 0) goto L_0x01f7;
    L_0x01d3:
        r3 = defpackage.ozp.d;
        r4 = "AFTB";
        r3 = r4.equals(r3);
        if (r3 != 0) goto L_0x01f1;
    L_0x01dd:
        r3 = defpackage.ozp.d;
        r4 = "AFTS";
        r3 = r4.equals(r3);
        if (r3 != 0) goto L_0x01f1;
    L_0x01e7:
        r3 = defpackage.ozp.d;
        r4 = "AFTM";
        r3 = r4.equals(r3);
        if (r3 == 0) goto L_0x01f7;
    L_0x01f1:
        r1 = defpackage.ohs.a(r5, r1);
        if (r1 != 0) goto L_0x01f8;
    L_0x01f7:
        r1 = r5;
    L_0x01f8:
        r3 = r0.b;
        r4 = r2.c;
        r5 = defpackage.ozp.a;
        if (r5 >= r7) goto L_0x021d;
    L_0x0200:
        r5 = defpackage.nyr.c;
        r3 = r5.equals(r3);
        if (r3 == 0) goto L_0x021d;
    L_0x0208:
        r3 = "video/mp4";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0211;
    L_0x0210:
        goto L_0x021a;
    L_0x0211:
        r3 = "audio/mp4";
        r3 = r3.equals(r4);
        if (r3 != 0) goto L_0x021a;
    L_0x0219:
        goto L_0x021d;
    L_0x021a:
        r3 = "cenc";
        goto L_0x021e;
    L_0x021d:
        r3 = r4;
    L_0x021e:
        r6 = r1;
        r7 = r3;
    L_0x0220:
        r4 = r0.a;
        r5 = r15;
        r8 = r17;
        r9 = r18;
        r1 = r4.getKeyRequest(r5, r6, r7, r8, r9);
        r3 = r0.b;
        r4 = r1.getData();
        r5 = defpackage.nyr.c;
        r3 = r5.equals(r3);
        if (r3 != 0) goto L_0x023a;
    L_0x0239:
        goto L_0x0258;
    L_0x023a:
        r3 = defpackage.ozp.a;
        r5 = 27;
        if (r3 >= r5) goto L_0x0258;
    L_0x0240:
        r3 = defpackage.ozp.a(r4);
        r4 = 43;
        r5 = 45;
        r3 = r3.replace(r4, r5);
        r4 = 47;
        r5 = 95;
        r3 = r3.replace(r4, r5);
        r4 = defpackage.ozp.c(r3);
    L_0x0258:
        r1 = r1.getDefaultUrl();
        r3 = "https://x";
        r3 = r3.equals(r1);
        if (r3 == 0) goto L_0x0266;
    L_0x0264:
        r1 = "";
    L_0x0266:
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x026d;
    L_0x026c:
        goto L_0x0279;
    L_0x026d:
        if (r2 == 0) goto L_0x0279;
    L_0x026f:
        r1 = r2.b;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x0279;
    L_0x0277:
        r1 = r2.b;
    L_0x0279:
        r1 = new odz;
        r1.<init>(r4);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oef.a(byte[], java.util.List, int, java.util.HashMap):odz");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (nyr.c.equals(this.b) && ozp.a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(ozp.a(bArr2));
                StringBuilder stringBuilder = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        stringBuilder.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    stringBuilder.append("{\"k\":\"");
                    stringBuilder.append(odp.a(jSONObject2.getString("k")));
                    stringBuilder.append("\",\"kid\":\"");
                    stringBuilder.append(odp.a(jSONObject2.getString("kid")));
                    stringBuilder.append("\",\"kty\":\"");
                    stringBuilder.append(jSONObject2.getString("kty"));
                    stringBuilder.append("\"}");
                }
                stringBuilder.append("]}");
                bArr2 = ozp.c(stringBuilder.toString());
            } catch (JSONException e) {
                String valueOf = String.valueOf(ozp.a(bArr2));
                String str = "Failed to adjust response data: ";
                oyp.b("ClearKeyUtil", valueOf.length() == 0 ? new String(str) : str.concat(valueOf), e);
            }
        }
        return this.a.provideKeyResponse(bArr, bArr2);
    }

    public final oed b() {
        ProvisionRequest provisionRequest = this.a.getProvisionRequest();
        return new oed(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    public final void b(byte[] bArr) {
        this.a.provideProvisionResponse(bArr);
    }

    public final Map c(byte[] bArr) {
        return this.a.queryKeyStatus(bArr);
    }

    public final void b(byte[] bArr, byte[] bArr2) {
        this.a.restoreKeys(bArr, bArr2);
    }

    public final String a(String str) {
        return this.a.getPropertyString(str);
    }

    public final void a(String str, String str2) {
        this.a.setPropertyString(str, str2);
    }

    private static UUID b(UUID uuid) {
        return (ozp.a >= 27 || !nyr.c.equals(uuid)) ? uuid : nyr.b;
    }

    public final /* synthetic */ ExoMediaCrypto d(byte[] bArr) {
        boolean z = false;
        if (ozp.a < 21 && nyr.d.equals(this.b)) {
            if ("L3".equals(a("securityLevel"))) {
                z = true;
            }
        }
        return new oeg(oef.b(this.b), bArr, z);
    }
}
