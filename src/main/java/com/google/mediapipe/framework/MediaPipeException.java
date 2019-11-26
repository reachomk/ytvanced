package com.google.mediapipe.framework;

import defpackage.ampv;
import defpackage.anuw;

public class MediaPipeException extends RuntimeException {
    MediaPipeException(int i, byte[] bArr) {
        String str = new String(bArr, ampv.c);
        String str2 = anuw.values()[i].a;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 2) + str.length());
        stringBuilder.append(str2);
        stringBuilder.append(": ");
        stringBuilder.append(str);
        super(stringBuilder.toString());
        anuw.values();
    }
}
