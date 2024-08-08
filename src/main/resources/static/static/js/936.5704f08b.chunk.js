"use strict";(self.webpackChunklistig_react_ui=self.webpackChunklistig_react_ui||[]).push([[936],{9936:(e,t,a)=>{a.r(t),a.d(t,{default:()=>f});var n=a(5043),s=a(9613),l=a(5865),i=a(3766),r=a(6605),o=a(710),d=a(5146),u=a(1637),c=a(1906),x=a(6446),h=a(835),m=a(6879),j=a(579);const A=new m.A,f=()=>{const{login:e,createAccount:t}=(0,n.useContext)(s.c),[a,m]=(0,n.useState)(!1),[f,g]=(0,n.useState)(!1),p=(0,h.Zp)(),[w,v]=(0,n.useState)(""),[C,y]=(0,n.useState)(""),[b,S]=(0,n.useState)(""),[W,k]=(0,n.useState)(""),[U,L]=(0,n.useState)(""),[P,_]=(0,n.useState)("");return(0,j.jsxs)(j.Fragment,{children:[(0,j.jsx)(l.A,{fontSize:"xx-large",sx:{fontFamily:"Garamond"},children:"Listig"}),(0,j.jsx)(x.A,{sx:{width:300,mx:"auto",mt:4,p:2,border:"1px solid #ccc",borderRadius:2,boxShadow:2},children:(0,j.jsxs)(i.A,{children:[(0,j.jsx)(r.A,{sx:{display:"flex",justifyContent:"center",textAlign:"center"},children:(0,j.jsx)(x.A,{sx:{width:"100%",display:"flex",justifyContent:"center"},children:(0,j.jsx)("h2",{children:"Login"})})}),(0,j.jsxs)(o.A,{children:[(0,j.jsx)(d.A,{fullWidth:!0,id:"username",label:"Username",variant:"outlined",value:w,onChange:e=>v(e.target.value)}),(0,j.jsx)(d.A,{fullWidth:!0,id:"password",label:"Password",type:"password",variant:"outlined",margin:"normal",value:C,onChange:e=>y(e.target.value)}),a?(0,j.jsx)(x.A,{sx:{display:"flex",justifyContent:"center",mt:4},children:(0,j.jsx)(u.A,{})}):(0,j.jsx)(c.A,{fullWidth:!0,variant:"outlined",sx:{mt:1,p:1},onClick:async()=>{m(!0),!0===await e(w,C)?p("/overview"):(m(!1),alert("Unable to log in"))},children:"Login"})]})]})}),(0,j.jsx)(x.A,{sx:{width:300,mx:"auto",mt:4,p:2,border:"1px solid #ccc",borderRadius:2,boxShadow:2},children:(0,j.jsxs)(i.A,{children:[(0,j.jsx)(r.A,{sx:{display:"flex",justifyContent:"center",textAlign:"center"},children:(0,j.jsx)(x.A,{sx:{width:"100%",display:"flex",justifyContent:"center"},children:(0,j.jsx)("h2",{children:"Create Account"})})}),(0,j.jsxs)(o.A,{children:[(0,j.jsx)(d.A,{fullWidth:!0,id:"new-username",label:"Username",variant:"outlined",value:b,onChange:e=>S(e.target.value)}),f&&(0,j.jsx)(l.A,{color:"error",children:"Username unavailable."}),(0,j.jsx)(d.A,{fullWidth:!0,id:"email",label:"Email",type:"email",variant:"outlined",margin:"normal",value:W,onChange:e=>k(e.target.value)}),(0,j.jsx)(d.A,{fullWidth:!0,id:"new-password",label:"Password",type:"password",variant:"outlined",margin:"normal",value:U,onChange:e=>L(e.target.value)}),(0,j.jsx)(d.A,{fullWidth:!0,id:"password-confirm",label:"Confirm Password",type:"password",variant:"outlined",margin:"normal",value:P,onChange:e=>_(e.target.value)}),a?(0,j.jsx)(x.A,{sx:{display:"flex",justifyContent:"center",mt:4},children:(0,j.jsx)(u.A,{})}):(0,j.jsx)(c.A,{fullWidth:!0,variant:"outlined",sx:{mt:1,p:1},onClick:async()=>{m(!0);if(await A.sendPostNoLogin("user/userExists",{username:b}))g(!0),m(!1);else{!0===await t({username:b,email:W,password:U,passwordConfirm:P,memberSince:""})?(console.log("account created"),p("/overview")):(m(!1),alert("Unable to create account"))}},children:"Create Account"})]})]})})]})}}}]);
//# sourceMappingURL=936.5704f08b.chunk.js.map