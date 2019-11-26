package defpackage;

/* renamed from: cnu */
public final class cnu {
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011d  */
    public static void addViewDescription(int r9, int r10, defpackage.cnr r11, java.lang.StringBuilder r12, boolean r13) {
        /*
        r0 = "litho.";
        r12.append(r0);
        r0 = r11.c();
        r0 = r0.b();
        r12.append(r0);
        r0 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r12.append(r0);
        r0 = r11.hashCode();
        r0 = java.lang.Integer.toHexString(r0);
        r12.append(r0);
        r0 = 32;
        r12.append(r0);
        r1 = r11.a();
        r2 = r11.b();
        r3 = 0;
        if (r2 == 0) goto L_0x0038;
    L_0x0030:
        r2 = new cnt;
        r4 = r11.a;
        r2.<init>(r4);
        goto L_0x0039;
    L_0x0038:
        r2 = r3;
    L_0x0039:
        r4 = "V";
        r5 = ".";
        if (r1 != 0) goto L_0x0040;
    L_0x003f:
        goto L_0x0048;
    L_0x0040:
        r6 = r1.getVisibility();
        if (r6 != 0) goto L_0x0048;
    L_0x0046:
        r6 = r4;
        goto L_0x0049;
    L_0x0048:
        r6 = r5;
    L_0x0049:
        r12.append(r6);
        r6 = 1;
        if (r2 != 0) goto L_0x0050;
    L_0x004f:
        goto L_0x005d;
    L_0x0050:
        r7 = r2.a;
        r7 = r7.p;
        if (r7 == 0) goto L_0x005d;
    L_0x0056:
        r7 = r7.z;
        if (r7 != r6) goto L_0x005d;
    L_0x005a:
        r7 = "F";
        goto L_0x005e;
    L_0x005d:
        r7 = r5;
    L_0x005e:
        r12.append(r7);
        if (r1 != 0) goto L_0x0064;
    L_0x0063:
        goto L_0x006d;
    L_0x0064:
        r7 = r1.isEnabled();
        if (r7 == 0) goto L_0x006d;
    L_0x006a:
        r7 = "E";
        goto L_0x006e;
    L_0x006d:
        r7 = r5;
    L_0x006e:
        r12.append(r7);
        r12.append(r5);
        if (r1 != 0) goto L_0x0077;
    L_0x0076:
        goto L_0x0080;
    L_0x0077:
        r7 = r1.isHorizontalScrollBarEnabled();
        if (r7 == 0) goto L_0x0080;
    L_0x007d:
        r7 = "H";
        goto L_0x0081;
    L_0x0080:
        r7 = r5;
    L_0x0081:
        r12.append(r7);
        if (r1 != 0) goto L_0x0087;
    L_0x0086:
        goto L_0x008e;
    L_0x0087:
        r1 = r1.isVerticalScrollBarEnabled();
        if (r1 == 0) goto L_0x008e;
    L_0x008d:
        goto L_0x008f;
    L_0x008e:
        r4 = r5;
    L_0x008f:
        r12.append(r4);
        if (r2 != 0) goto L_0x0095;
    L_0x0094:
        goto L_0x009d;
    L_0x0095:
        r1 = r2.a();
        if (r1 == 0) goto L_0x009d;
    L_0x009b:
        r5 = "C";
    L_0x009d:
        r12.append(r5);
        r1 = ". .. ";
        r12.append(r1);
        r1 = r11.a;
        r1 = r1.i();
        r4 = r11.a;
        r4 = r4.j();
        r5 = new android.graphics.Rect;
        r7 = r11.a;
        r7 = r7.a();
        r7 = r7 + r1;
        r8 = r11.a;
        r8 = r8.b();
        r8 = r8 + r4;
        r5.<init>(r1, r4, r7, r8);
        r1 = r5.left;
        r1 = r1 + r9;
        r12.append(r1);
        r1 = ",";
        r12.append(r1);
        r4 = r5.top;
        r4 = r4 + r10;
        r12.append(r4);
        r4 = "-";
        r12.append(r4);
        r4 = r5.right;
        r9 = r9 + r4;
        r12.append(r9);
        r12.append(r1);
        r9 = r5.bottom;
        r10 = r10 + r9;
        r12.append(r10);
        r9 = r11.b();
        if (r9 == 0) goto L_0x00f4;
    L_0x00ef:
        r9 = r11.a;
        r9 = r9.B;
        goto L_0x00f5;
    L_0x00f4:
        r9 = r3;
    L_0x00f5:
        r10 = 0;
        if (r9 != 0) goto L_0x00f9;
    L_0x00f8:
        goto L_0x0112;
    L_0x00f9:
        r1 = android.text.TextUtils.isEmpty(r9);
        if (r1 != 0) goto L_0x0112;
    L_0x00ff:
        r1 = new java.lang.Object[r6];
        r4 = 95;
        r9 = r9.replace(r0, r4);
        r1[r10] = r9;
        r9 = " litho:id/%s";
        r9 = java.lang.String.format(r9, r1);
        r12.append(r9);
    L_0x0112:
        r9 = r11.a();
        r11 = r11.c();
        if (r9 != 0) goto L_0x011d;
    L_0x011c:
        goto L_0x0132;
    L_0x011d:
        r9 = r9.u;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r9.e;
        if (r1 == 0) goto L_0x012a;
    L_0x0128:
        r1 = r1.length;
        goto L_0x012b;
    L_0x012a:
        r1 = 0;
    L_0x012b:
        r4 = 0;
    L_0x012c:
        if (r4 < r1) goto L_0x016c;
    L_0x012e:
        r3 = r0.toString();
    L_0x0132:
        if (r3 != 0) goto L_0x0135;
    L_0x0134:
        goto L_0x0156;
    L_0x0135:
        r9 = android.text.TextUtils.isEmpty(r3);
        if (r9 != 0) goto L_0x0156;
    L_0x013b:
        r9 = new java.lang.Object[r6];
        r11 = "";
        r0 = "\n";
        r0 = r3.replace(r0, r11);
        r1 = "\"";
        r11 = r0.replace(r1, r11);
        r9[r10] = r11;
        r10 = " text=\"%s\"";
        r9 = java.lang.String.format(r10, r9);
        r12.append(r9);
    L_0x0156:
        if (r13 == 0) goto L_0x0159;
    L_0x0158:
        goto L_0x0166;
    L_0x0159:
        if (r2 == 0) goto L_0x0166;
    L_0x015b:
        r9 = r2.a();
        if (r9 == 0) goto L_0x0166;
    L_0x0161:
        r9 = " [clickable]";
        r12.append(r9);
    L_0x0166:
        r9 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r12.append(r9);
        return;
    L_0x016c:
        r5 = r9.a(r4);
        if (r5 == 0) goto L_0x0175;
    L_0x0172:
        r7 = r5.c;
        goto L_0x0176;
    L_0x0175:
        r7 = r3;
    L_0x0176:
        if (r7 != 0) goto L_0x0179;
    L_0x0178:
        goto L_0x01ac;
    L_0x0179:
        r7 = r7.a(r11);
        if (r7 == 0) goto L_0x01ac;
    L_0x017f:
        r5 = r5.d;
        r7 = r5 instanceof com.facebook.litho.TextContent;
        if (r7 == 0) goto L_0x019f;
    L_0x0185:
        r5 = (com.facebook.litho.TextContent) r5;
        r5 = r5.getTextItems();
        r5 = r5.iterator();
    L_0x018f:
        r7 = r5.hasNext();
        if (r7 == 0) goto L_0x01ac;
    L_0x0195:
        r7 = r5.next();
        r7 = (java.lang.CharSequence) r7;
        r0.append(r7);
        goto L_0x018f;
    L_0x019f:
        r7 = r5 instanceof android.widget.TextView;
        if (r7 == 0) goto L_0x01ac;
    L_0x01a3:
        r5 = (android.widget.TextView) r5;
        r5 = r5.getText();
        r0.append(r5);
    L_0x01ac:
        r4 = r4 + 1;
        goto L_0x012c;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnu.addViewDescription(int, int, cnr, java.lang.StringBuilder, boolean):void");
    }
}
