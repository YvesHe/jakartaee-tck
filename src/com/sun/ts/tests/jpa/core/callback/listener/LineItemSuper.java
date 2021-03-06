/*
 * Copyright (c) 2007, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

/*
 * $Id$
 */

package com.sun.ts.tests.jpa.core.callback.listener;

import com.sun.ts.tests.jpa.core.callback.common.CallbackStatusIF;
import com.sun.ts.tests.jpa.core.callback.common.CallbackStatusImpl;
import com.sun.ts.tests.jpa.core.callback.common.ListenerA;
import com.sun.ts.tests.jpa.core.callback.common.ListenerB;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
@EntityListeners({ ListenerA.class, ListenerB.class })
public class LineItemSuper extends CallbackStatusImpl
    implements java.io.Serializable, CallbackStatusIF {
  public int quantity;

  public LineItemSuper() {
  }

  @Column(name = "QUANTITY")
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int v) {
    quantity = v;
  }
}
