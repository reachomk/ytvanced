package defpackage;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;

/* renamed from: amdi */
public final class amdi {
    private final Context a;
    private final MediaMetadataRetriever b;
    private final MediaExtractor c;
    private final alys d;

    public amdi(Context context, alys alys) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.a = context;
        this.b = mediaMetadataRetriever;
        this.c = mediaExtractor;
        this.d = alys;
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x0233 A:{Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0363, all -> 0x0360 }} */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x022c A:{Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0363, all -> 0x0360 }} */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0243 A:{Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0363, all -> 0x0360 }} */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02c3 A:{Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0363, all -> 0x0360 }} */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x030e A:{Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0363, all -> 0x0360 }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0173 */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01df A:{Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0363, all -> 0x0360 }} */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x022c A:{Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0363, all -> 0x0360 }} */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0233 A:{Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0363, all -> 0x0360 }} */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0243 A:{Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0363, all -> 0x0360 }} */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02c3 A:{Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0363, all -> 0x0360 }} */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x030e A:{Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0363, all -> 0x0360 }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00f2 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(23:15|16|17|(1:19)(2:20|(1:22)(1:23))|24|(2:26|27)|28|29|30|(3:32|(2:33|(4:35|36|(1:154)(4:38|(1:40)(1:(2:42|155))|43|(2:45|156)(1:(2:47|157)(2:48|153)))|49)(1:152))|(1:51)(1:(12:53|54|55|56|57|58|61|62|63|(1:65)(1:66)|67|(1:69)(2:70|71))))|72|(3:74|(3:77|(13:158|79|(1:81)(1:82)|(1:85)(1:86)|87|(3:89|(5:92|(4:95|(2:97|(2:99|(8:101|(2:104|102)|167|105|(1:107)|168|108|(2:160|110)(2:111|163))(1:166))(1:165))(1:164)|112|93)|162|113|90)|161)|114|(3:116|(4:119|(2:121|(2:123|(2:171|126))(1:173))(1:172)|169|117)|170)|127|(3:129|(3:132|(1:176)(2:177|136)|130)|178)(0)|137|138|139)|75)|159)|83|(0)(0)|87|(0)|114|(0)|127|(0)(0)|137|138|139) */
    public final defpackage.amdr a(android.net.Uri r18) {
        /*
        r17 = this;
        r1 = r17;
        r2 = r18;
        r3 = "";
        r4 = "Could not access URI: ";
        r5 = defpackage.amdr.r;
        r5 = r5.createBuilder();
        r5 = (defpackage.amdu) r5;
        r6 = r18.getScheme();
        r7 = "content";
        r6 = r6.equals(r7);
        if (r6 != 0) goto L_0x0054;
    L_0x001c:
        r6 = r18.getScheme();
        r7 = "file";
        r6 = r6.equals(r7);
        if (r6 == 0) goto L_0x0029;
    L_0x0028:
        goto L_0x0054;
    L_0x0029:
        r2 = java.lang.String.valueOf(r18);
        r3 = r2.length();
        r4 = new java.lang.StringBuilder;
        r3 = r3 + 37;
        r4.<init>(r3);
        r3 = "VSI extraction not possible for uri: ";
        r4.append(r3);
        r4.append(r2);
        r2 = r4.toString();
        defpackage.xtl.e(r2);
        r2 = 3;
        r5.e(r2);
        r2 = r5.build();
        r2 = (defpackage.anxl) r2;
        r2 = (defpackage.amdr) r2;
        return r2;
    L_0x0054:
        r7 = r1.a;	 Catch:{ Exception -> 0x03b2 }
        r7 = r7.getContentResolver();	 Catch:{ Exception -> 0x03b2 }
        r8 = "r";
        r7 = r7.openAssetFileDescriptor(r2, r8);	 Catch:{ Exception -> 0x03b2 }
        r8 = -1;
        if (r7 == 0) goto L_0x006c;
    L_0x0064:
        r10 = r7.getLength();	 Catch:{ Exception -> 0x03b2 }
        r7.close();	 Catch:{ Exception -> 0x03b2 }
        goto L_0x006d;
    L_0x006c:
        r10 = r8;
    L_0x006d:
        r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
        if (r7 != 0) goto L_0x009c;
    L_0x0071:
        r2 = java.lang.String.valueOf(r18);
        r3 = r2.length();
        r4 = new java.lang.StringBuilder;
        r3 = r3 + 55;
        r4.<init>(r3);
        r3 = "VSI extraction not possible for uri with unknown size: ";
        r4.append(r3);
        r4.append(r2);
        r2 = r4.toString();
        defpackage.xtl.e(r2);
        r2 = 5;
        r5.e(r2);
        r2 = r5.build();
        r2 = (defpackage.anxl) r2;
        r2 = (defpackage.amdr) r2;
        return r2;
    L_0x009c:
        r5.a(r10);
        r9 = r1.b;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r10 = r1.a;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r9.setDataSource(r10, r2);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r9 = r1.b;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r10 = 12;
        r10 = r9.extractMetadata(r10);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r11 = android.text.TextUtils.isEmpty(r10);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r11 == 0) goto L_0x00ba;
    L_0x00b4:
        r10 = defpackage.atkw.CONTAINER_ID_NONE;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r5.a(r10);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        goto L_0x00d3;
    L_0x00ba:
        r11 = defpackage.amdh.a;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r11 = r11.containsKey(r10);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r11 == 0) goto L_0x00ce;
    L_0x00c2:
        r11 = defpackage.amdh.a;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r10 = r11.get(r10);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r10 = (defpackage.atkw) r10;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r5.a(r10);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        goto L_0x00d3;
    L_0x00ce:
        r10 = defpackage.atkw.CONTAINER_ID_UNKNOWN;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r5.a(r10);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
    L_0x00d3:
        r10 = 24;
        r9 = r9.extractMetadata(r10);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r10 = android.text.TextUtils.isEmpty(r9);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r10 != 0) goto L_0x00f2;
    L_0x00df:
        r9 = java.lang.Integer.parseInt(r9);	 Catch:{ NumberFormatException -> 0x00f2 }
        r5.copyOnWrite();	 Catch:{ NumberFormatException -> 0x00f2 }
        r10 = r5.instance;	 Catch:{ NumberFormatException -> 0x00f2 }
        r10 = (defpackage.amdr) r10;	 Catch:{ NumberFormatException -> 0x00f2 }
        r11 = r10.a;	 Catch:{ NumberFormatException -> 0x00f2 }
        r11 = r11 | 1024;
        r10.a = r11;	 Catch:{ NumberFormatException -> 0x00f2 }
        r10.l = r9;	 Catch:{ NumberFormatException -> 0x00f2 }
    L_0x00f2:
        r5.build();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r9 = r1.c;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r10 = r1.a;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r11 = 0;
        r9.setDataSource(r10, r2, r11);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r9 = r1.c;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r9 = r9.getTrackCount();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r10 = -1;
        r12 = 2;
        r13 = 0;
        r14 = 1;
        if (r9 != r12) goto L_0x01d3;
    L_0x0109:
        r15 = r11;
        r9 = 0;
    L_0x010b:
        r6 = "mime";
        if (r9 >= r12) goto L_0x013c;
    L_0x010f:
        r7 = r1.c;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = r7.getTrackFormat(r9);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = r7.getString(r6);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r8 = android.text.TextUtils.isEmpty(r6);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r8 != 0) goto L_0x0139;
    L_0x011f:
        r8 = "video/";
        r8 = r6.startsWith(r8);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r8 != 0) goto L_0x0128;
    L_0x0127:
        goto L_0x012c;
    L_0x0128:
        if (r11 != 0) goto L_0x012c;
    L_0x012a:
        r11 = r7;
        goto L_0x0139;
    L_0x012c:
        r8 = "audio/";
        r6 = r6.startsWith(r8);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r6 != 0) goto L_0x0135;
    L_0x0134:
        goto L_0x0139;
    L_0x0135:
        if (r15 == 0) goto L_0x0138;
    L_0x0137:
        goto L_0x0139;
    L_0x0138:
        r15 = r7;
    L_0x0139:
        r9 = r9 + 1;
        goto L_0x010b;
    L_0x013c:
        if (r15 != 0) goto L_0x0140;
    L_0x013e:
        goto L_0x01d3;
    L_0x0140:
        if (r11 == 0) goto L_0x01d3;
    L_0x0142:
        r7 = defpackage.amdk.a(r11, r6, r3);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = defpackage.amdk.a(r7);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r5.a(r7);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = "width";
        r7 = defpackage.amdk.a(r11, r7, r13);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r5.a(r7);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = "height";
        r7 = defpackage.amdk.a(r11, r7, r13);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r5.b(r7);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = "color-format";
        r7 = defpackage.amdk.a(r11, r7, r10);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = defpackage.amdk.a(r7);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r5.a(r7);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = "durationUs";
        r7 = r11.getLong(r7);	 Catch:{ ClassCastException | NullPointerException -> 0x0173, ClassCastException | NullPointerException -> 0x0173 }
        goto L_0x017b;
    L_0x0173:
        r7 = r11.getInteger(r7);	 Catch:{ ClassCastException | NullPointerException -> 0x0179, ClassCastException | NullPointerException -> 0x0179 }
        r7 = (long) r7;
        goto L_0x017b;
    L_0x0179:
        r7 = 0;
    L_0x017b:
        r7 = (double) r7;
        r5.copyOnWrite();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r9 = r5.instance;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r9 = (defpackage.amdr) r9;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r11 = r9.a;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r11 = r11 | r14;
        r9.a = r11;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r9.b = r7;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r3 = defpackage.amdk.a(r15, r6, r3);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = defpackage.amdh.c;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = r6.containsKey(r3);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r6 == 0) goto L_0x019f;
    L_0x0196:
        r6 = defpackage.amdh.c;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r3 = r6.get(r3);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r3 = (defpackage.atku) r3;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        goto L_0x01a1;
    L_0x019f:
        r3 = defpackage.atku.CODEC_ID_UNKNOWN;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
    L_0x01a1:
        r5.copyOnWrite();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = r5.instance;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = (defpackage.amdr) r6;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r3 == 0) goto L_0x01cd;
    L_0x01aa:
        r7 = r6.a;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = r7 | 64;
        r6.a = r7;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r3 = r3.p;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6.h = r3;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r3 = "channel-count";
        r3 = defpackage.amdk.a(r15, r3, r13);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r5.copyOnWrite();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = r5.instance;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = (defpackage.amdr) r6;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = r6.a;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = r7 | 512;
        r6.a = r7;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6.k = r3;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r5.build();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        goto L_0x01d3;
    L_0x01cd:
        r3 = new java.lang.NullPointerException;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r3.<init>();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        throw r3;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
    L_0x01d3:
        r3 = r1.a;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r3 = defpackage.amdj.a(r3, r2);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = r3.a();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r6 == 0) goto L_0x0229;
    L_0x01df:
        r7 = defpackage.ckg.class;
        r6 = r6.a(r7);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = r6.iterator();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
    L_0x01e9:
        r7 = r6.hasNext();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r7 == 0) goto L_0x0229;
    L_0x01ef:
        r7 = r6.next();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = (defpackage.ckg) r7;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = r7.g();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = r7.a();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = r7.a();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r8 = r7 instanceof defpackage.cle;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r8 == 0) goto L_0x01e9;
    L_0x0205:
        r7 = (defpackage.cle) r7;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = defpackage.balu.class;
        r6 = r7.a(r6);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = r6.size();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r7 != r14) goto L_0x0223;
    L_0x0213:
        r6 = r6.get(r13);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = (defpackage.balu) r6;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r11 = new amdm;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = r6.a;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = r6.b;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r11.<init>(r7, r6);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        goto L_0x022a;
    L_0x0223:
        r11 = new amdm;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r11.<init>(r14, r14);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        goto L_0x022a;
    L_0x0229:
        r11 = 0;
    L_0x022a:
        if (r11 != 0) goto L_0x0233;
    L_0x022c:
        r5.c(r14);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r5.d(r14);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        goto L_0x023d;
    L_0x0233:
        r6 = r11.a;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r5.c(r6);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = r11.b;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r5.d(r6);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
    L_0x023d:
        r6 = r3.a();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r6 == 0) goto L_0x02bd;
    L_0x0243:
        r7 = defpackage.ckg.class;
        r6 = r6.a(r7);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = r6.iterator();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
    L_0x024d:
        r7 = r6.hasNext();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r7 == 0) goto L_0x02bd;
    L_0x0253:
        r7 = r6.next();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = (defpackage.ckg) r7;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = r7.b();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = r7.iterator();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
    L_0x0261:
        r8 = r7.hasNext();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r8 == 0) goto L_0x02bb;
    L_0x0267:
        r8 = r7.next();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r8 = (defpackage.cis) r8;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r9 = r8 instanceof defpackage.ckh;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r9 == 0) goto L_0x02b9;
    L_0x0271:
        r8 = (defpackage.ckh) r8;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r8 = r8.i;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r8 == 0) goto L_0x02b9;
    L_0x0277:
        r9 = r8.length;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r11 = 16;
        if (r9 != r11) goto L_0x02b9;
    L_0x027c:
        r9 = 0;
        r12 = 0;
    L_0x027f:
        r15 = 8;
        if (r9 >= r15) goto L_0x028e;
    L_0x0283:
        r12 = r12 << r15;
        r15 = r8[r9];	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r15 = r15 & 255;
        r14 = (long) r15;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r12 = r12 | r14;
        r9 = r9 + 1;
        r14 = 1;
        goto L_0x027f;
    L_0x028e:
        r14 = r6;
        r16 = r7;
        r6 = 0;
        r9 = 8;
    L_0x0295:
        if (r9 >= r11) goto L_0x02a4;
    L_0x0297:
        r6 = r6 << r15;
        r11 = r8[r9];	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r11 = r11 & 255;
        r10 = (long) r11;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = r6 | r10;
        r9 = r9 + 1;
        r10 = -1;
        r11 = 16;
        goto L_0x0295;
    L_0x02a4:
        r8 = new java.util.UUID;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r8.<init>(r12, r6);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = defpackage.amdj.a;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = r6.equals(r8);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r6 == 0) goto L_0x02b3;
    L_0x02b1:
        goto L_0x0343;
    L_0x02b3:
        r6 = r14;
        r7 = r16;
        r10 = -1;
        r12 = 2;
        r13 = 0;
    L_0x02b9:
        r14 = 1;
        goto L_0x0261;
    L_0x02bb:
        r14 = 1;
        goto L_0x024d;
    L_0x02bd:
        r6 = r3.a();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r6 == 0) goto L_0x0307;
    L_0x02c3:
        r7 = defpackage.ckg.class;
        r6 = r6.a(r7);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = r6.iterator();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
    L_0x02cd:
        r7 = r6.hasNext();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r7 == 0) goto L_0x0307;
    L_0x02d3:
        r7 = r6.next();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = (defpackage.ckg) r7;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = r7.g();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = r7.a();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = r7.a();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r8 = r7 instanceof defpackage.cle;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r8 == 0) goto L_0x02cd;
    L_0x02e9:
        r7 = (defpackage.cle) r7;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r8 = defpackage.uky.class;
        r7 = r7.a(r8);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r8 = r7.size();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r9 = 1;
        if (r8 != r9) goto L_0x02cd;
    L_0x02f8:
        r8 = 0;
        r7 = r7.get(r8);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = (defpackage.uky) r7;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = r7.a;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r9 = -1;
        if (r7 == r9) goto L_0x02cd;
    L_0x0304:
        if (r7 == 0) goto L_0x02cd;
    L_0x0306:
        goto L_0x0343;
    L_0x0307:
        r8 = 0;
        r3 = r3.a();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r3 == 0) goto L_0x0344;
    L_0x030e:
        r6 = defpackage.ckg.class;
        r3 = r3.a(r6);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r3 = r3.iterator();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
    L_0x0318:
        r6 = r3.hasNext();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r6 == 0) goto L_0x0344;
    L_0x031e:
        r6 = r3.next();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = (defpackage.ckg) r6;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = r6.g();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = r6.a();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = r6.a();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = r6 instanceof defpackage.cle;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        if (r7 == 0) goto L_0x0318;
    L_0x0334:
        r6 = (defpackage.cle) r6;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r7 = defpackage.ukv.class;
        r6 = r6.a(r7);	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = r6.size();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r9 = 1;
        if (r6 != r9) goto L_0x0318;
    L_0x0343:
        r8 = 1;
    L_0x0344:
        r5.copyOnWrite();	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r3 = r5.instance;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r3 = (defpackage.amdr) r3;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = r3.a;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r6 = r6 | 8192;
        r3.a = r6;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r3.o = r8;	 Catch:{ SecurityException -> 0x0367, IllegalArgumentException -> 0x0365, IOException | IllegalArgumentException | SecurityException -> 0x0363 }
        r2 = 2;
        r5.e(r2);
        r2 = r5.build();
        r2 = (defpackage.anxl) r2;
        r2 = (defpackage.amdr) r2;
        return r2;
    L_0x0360:
        r0 = move-exception;
        r2 = r0;
        goto L_0x0399;
    L_0x0363:
        r0 = move-exception;
        goto L_0x0368;
    L_0x0365:
        r0 = move-exception;
        goto L_0x0368;
    L_0x0367:
        r0 = move-exception;
    L_0x0368:
        r3 = r0;
        r6 = r1.d;	 Catch:{ all -> 0x0360 }
        r2 = java.lang.String.valueOf(r18);	 Catch:{ all -> 0x0360 }
        r7 = r2.length();	 Catch:{ all -> 0x0360 }
        r7 = r7 + 22;
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0360 }
        r8.<init>(r7);	 Catch:{ all -> 0x0360 }
        r8.append(r4);	 Catch:{ all -> 0x0360 }
        r8.append(r2);	 Catch:{ all -> 0x0360 }
        r2 = r8.toString();	 Catch:{ all -> 0x0360 }
        r6.a(r2, r3);	 Catch:{ all -> 0x0360 }
        r2 = 0;
        r5.a(r2);	 Catch:{ all -> 0x0360 }
        r2 = 4;
        r5.e(r2);	 Catch:{ all -> 0x0360 }
        r2 = r5.build();	 Catch:{ all -> 0x0360 }
        r2 = (defpackage.anxl) r2;	 Catch:{ all -> 0x0360 }
        r2 = (defpackage.amdr) r2;	 Catch:{ all -> 0x0360 }
        return r2;
    L_0x0399:
        r3 = r1.d;
        r4 = "ClientVSI extraction failed.";
        r3.a(r4, r2);
        r2 = 0;
        r5.a(r2);
        r2 = 6;
        r5.e(r2);
        r2 = r5.build();
        r2 = (defpackage.anxl) r2;
        r2 = (defpackage.amdr) r2;
        return r2;
    L_0x03b2:
        r0 = move-exception;
        r3 = r0;
        r6 = r1.d;
        r2 = java.lang.String.valueOf(r18);
        r7 = r2.length();
        r8 = new java.lang.StringBuilder;
        r7 = r7 + 22;
        r8.<init>(r7);
        r8.append(r4);
        r8.append(r2);
        r2 = r8.toString();
        r6.a(r2, r3);
        r2 = 4;
        r5.e(r2);
        r2 = r5.build();
        r2 = (defpackage.anxl) r2;
        r2 = (defpackage.amdr) r2;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amdi.a(android.net.Uri):amdr");
    }

    public static apwu a(amdr amdr) {
        if (amdr == null) {
            return null;
        }
        apwt apwt = (apwt) apwu.l.createBuilder();
        double d = amdr.b;
        apwt.copyOnWrite();
        apwu apwu = (apwu) apwt.instance;
        apwu.a |= 1;
        apwu.b = d;
        int i = amdr.c;
        apwt.copyOnWrite();
        apwu apwu2 = (apwu) apwt.instance;
        apwu2.a |= 2;
        apwu2.c = i;
        i = amdr.d;
        apwt.copyOnWrite();
        apwu2 = (apwu) apwt.instance;
        apwu2.a |= 4;
        apwu2.d = i;
        boolean z = amdr.e;
        apwt.copyOnWrite();
        apwu2 = (apwu) apwt.instance;
        apwu2.a |= 8;
        apwu2.e = z;
        atkw a = atkw.a(amdr.f);
        if (a == null) {
            a = atkw.CONTAINER_ID_NONE;
        }
        apwt.copyOnWrite();
        apwu2 = (apwu) apwt.instance;
        if (a != null) {
            apwu2.a |= 16;
            apwu2.f = a.f;
            atku a2 = atku.a(amdr.g);
            if (a2 == null) {
                a2 = atku.CODEC_ID_NONE;
            }
            apwt.copyOnWrite();
            apwu2 = (apwu) apwt.instance;
            if (a2 != null) {
                apwu2.a |= 32;
                apwu2.g = a2.p;
                a2 = atku.a(amdr.h);
                if (a2 == null) {
                    a2 = atku.CODEC_ID_NONE;
                }
                apwt.copyOnWrite();
                apwu2 = (apwu) apwt.instance;
                if (a2 != null) {
                    apwu2.a |= 64;
                    apwu2.h = a2.p;
                    d = amdr.i;
                    apwt.copyOnWrite();
                    apwu = (apwu) apwt.instance;
                    apwu.a |= 128;
                    apwu.i = d;
                    atky a3 = atky.a(amdr.j);
                    if (a3 == null) {
                        a3 = atky.PIXEL_FORMAT_ID_UNKNOWN;
                    }
                    apwt.copyOnWrite();
                    apwu2 = (apwu) apwt.instance;
                    if (a3 != null) {
                        apwu2.a |= 256;
                        apwu2.j = a3.f;
                        int i2 = amdr.k;
                        apwt.copyOnWrite();
                        apwu apwu3 = (apwu) apwt.instance;
                        apwu3.a |= 512;
                        apwu3.k = i2;
                        return (apwu) ((anxl) apwt.build());
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
