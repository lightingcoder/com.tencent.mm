package com.tencent.mm.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class tx
  extends c
{
  private final int height = 168;
  private final int width = 168;
  
  protected final int i(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 168;
      return 168;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.d(paramVarArgs);
      Object localObject3 = c.c(paramVarArgs);
      Object localObject2 = c.g(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint = c.g(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-9473160);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 39.0F, 0.0F, 1.0F, 51.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.h(paramVarArgs);
      ((Path)localObject3).moveTo(2.994461F, 0.0F);
      ((Path)localObject3).cubicTo(1.3406659F, 0.0F, 0.0F, 1.3482827F, 0.0F, 3.007385F);
      ((Path)localObject3).lineTo(0.0F, 62.992615F);
      ((Path)localObject3).cubicTo(0.0F, 64.65355F, 1.3420956F, 66.0F, 2.994461F, 66.0F);
      ((Path)localObject3).lineTo(87.00554F, 66.0F);
      ((Path)localObject3).cubicTo(88.65933F, 66.0F, 90.0F, 64.65172F, 90.0F, 62.992615F);
      ((Path)localObject3).lineTo(90.0F, 3.007385F);
      ((Path)localObject3).cubicTo(90.0F, 1.3464521F, 88.657906F, 0.0F, 87.00554F, 0.0F);
      ((Path)localObject3).lineTo(2.994461F, 0.0F);
      ((Path)localObject3).lineTo(2.994461F, 0.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(6.0F, 6.0F);
      ((Path)localObject3).lineTo(84.0F, 6.0F);
      ((Path)localObject3).lineTo(84.0F, 59.0F);
      ((Path)localObject3).lineTo(6.0F, 59.0F);
      ((Path)localObject3).lineTo(6.0F, 6.0F);
      ((Path)localObject3).lineTo(6.0F, 6.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.h(paramVarArgs);
      ((Path)localObject2).moveTo(68.1287F, 27.99035F);
      ((Path)localObject2).lineTo(56.0F, 38.0F);
      ((Path)localObject2).lineTo(60.023453F, 46.799316F);
      ((Path)localObject2).lineTo(29.0F, 18.0F);
      ((Path)localObject2).lineTo(0.5F, 45.676216F);
      ((Path)localObject2).lineTo(0.5F, 60.043144F);
      ((Path)localObject2).lineTo(87.6875F, 60.043144F);
      ((Path)localObject2).lineTo(87.6875F, 45.676216F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.f(paramVarArgs);
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.svg.a.a.tx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */