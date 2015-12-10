/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright by The HDF Group.                                               *
 * Copyright by the Board of Trustees of the University of Illinois.         *
 * All rights reserved.                                                      *
 *                                                                           *
 * This file is part of HDF5.  The full HDF5 copyright notice, including     *
 * terms governing use, modification, and redistribution, is contained in    *
 * the files COPYING and Copyright.html.  COPYING can be found at the root   *
 * of the source code distribution tree; Copyright.html can be found at the  *
 * root level of an installed copy of the electronic HDF5 document set and   *
 * is linked from the top-level documents page.  It can also be found at     *
 * http://hdfgroup.org/HDF5/doc/Copyright.html.  If you do not have          *
 * access to either file, you may request a copy from help@hdfgroup.org.     *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses( { TestH5.class,
        TestH5Eregister.class,
        TestH5Edefault.class,
        TestH5E.class,
        TestH5Fparams.class, TestH5Fbasic.class, TestH5F.class,
        TestH5Gbasic.class, TestH5G.class, TestH5Giterate.class,
        TestH5Sbasic.class, TestH5S.class,
        TestH5Tparams.class, TestH5Tbasic.class, TestH5T.class,
        TestH5Dparams.class, TestH5D.class, TestH5Dplist.class,
        TestH5Lparams.class, TestH5Lbasic.class, TestH5Lcreate.class,
        TestH5R.class,
        TestH5P.class, TestH5PData.class, TestH5Pfapl.class,
        TestH5A.class,
        TestH5Oparams.class, TestH5Obasic.class, TestH5Ocopy.class, TestH5Ocreate.class,
        TestH5Z.class
})

public class TestAll {
}