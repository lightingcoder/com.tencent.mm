package com.tencent.mm.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class xb
  extends c
{
  private final int height = 128;
  private final int width = 128;
  
  protected final int i(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 128;
      return 128;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.d(paramVarArgs);
      c.c(paramVarArgs);
      Paint localPaint = c.g(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.g(paramVarArgs);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramVarArgs).setStrokeWidth(1.0F);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-9934744);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.h(paramVarArgs);
      ((Path)localObject).moveTo(99.6112F, 22.666666F);
      ((Path)localObject).lineTo(123.9934F, 22.666666F);
      ((Path)localObject).cubicTo(126.21499F, 22.666666F, 128.0F, 24.455502F, 128.0F, 26.662142F);
      ((Path)localObject).lineTo(128.0F, 112.004524F);
      ((Path)localObject).cubicTo(128.0F, 114.21889F, 126.206184F, 116.0F, 123.9934F, 116.0F);
      ((Path)localObject).lineTo(4.006597F, 116.0F);
      ((Path)localObject).cubicTo(1.7850137F, 116.0F, 0.0F, 114.21117F, 0.0F, 112.004524F);
      ((Path)localObject).lineTo(0.0F, 26.662142F);
      ((Path)localObject).cubicTo(0.0F, 24.447783F, 1.7938147F, 22.666666F, 4.006597F, 22.666666F);
      ((Path)localObject).lineTo(28.388798F, 22.666666F);
      ((Path)localObject).lineTo(40.727272F, 11.0F);
      ((Path)localObject).lineTo(87.27273F, 11.0F);
      ((Path)localObject).lineTo(99.6112F, 22.666666F);
      ((Path)localObject).lineTo(99.6112F, 22.666666F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(64.0F, 104.333336F);
      ((Path)localObject).cubicTo(85.42195F, 104.333336F, 102.78788F, 86.92219F, 102.78788F, 65.44444F);
      ((Path)localObject).cubicTo(102.78788F, 43.966705F, 85.42195F, 26.555555F, 64.0F, 26.555555F);
      ((Path)localObject).cubicTo(42.578045F, 26.555555F, 25.212122F, 43.966705F, 25.212122F, 65.44444F);
      ((Path)localObject).cubicTo(25.212122F, 86.92219F, 42.578045F, 104.333336F, 64.0F, 104.333336F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(64.0F, 90.72222F);
      ((Path)localObject).cubicTo(77.92427F, 90.72222F, 89.21212F, 79.404976F, 89.21212F, 65.44444F);
      ((Path)localObject).cubicTo(89.21212F, 51.483913F, 77.92427F, 40.166668F, 64.0F, 40.166668F);
      ((Path)localObject).cubicTo(50.07573F, 40.166668F, 38.78788F, 51.483913F, 38.78788F, 65.44444F);
      ((Path)localObject).cubicTo(38.78788F, 79.404976F, 50.07573F, 90.72222F, 64.0F, 90.72222F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.f(paramVarArgs);
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.svg.a.a.xb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */