"use strict";(self.webpackChunklistig_react_ui=self.webpackChunklistig_react_ui||[]).push([[878],{6879:(e,t,r)=>{r.d(t,{A:()=>o});var a=r(9217);class o{constructor(){this.baseUrl=a.C1}async sendPost(e,t,r){const a=await fetch(this.baseUrl+e,{method:"POST",headers:{"Content-Type":"application/json",Authorization:"Basic "+r},body:JSON.stringify(t)});if(!a.ok){console.log(await a.json());const e=await a.json();throw new Error(e)}return await a.json()}async sendPostNoLogin(e,t){const r=await fetch(this.baseUrl+e,{method:"POST",headers:{"Content-Type":"application/json"},body:JSON.stringify(t)});if(!r.ok){const e=await r.json();throw new Error(e)}return await r.json()}async sendGet(e,t){const r=await fetch(this.baseUrl+e,{method:"GET",headers:{"Content-Type":"application/json",Authorization:"Basic "+t}});if(!r.ok)throw new Error(await r.json());return await r.json()}async sendGetNoAuth(e){const t=await fetch(this.baseUrl+e,{method:"GET",headers:{"Content-Type":"application/json"}});if(!t.ok)throw new Error(await t.json());return await t.json()}async sendDelete(e,t,r){const a=await fetch(this.baseUrl+e,{method:"DELETE",headers:{"Content-Type":"application/json",Authorization:"Basic "+r},body:JSON.stringify(t)});if(!a.ok)throw new Error(await a.json());return await a.json()}}},2475:(e,t,r)=>{r.d(t,{A:()=>p});r(5043);var a=r(5721),o=r(1322),n=r(3851),i=r(6446),s=r(8734),d=r(7392),c=r(4208),l=r(579);const p=e=>{let{uList:t}=e;return(0,l.jsx)(l.Fragment,{children:(0,l.jsx)(a.A,{children:t.items.map((e=>(0,l.jsxs)(o.Ay,{sx:{cursor:"pointer",border:"1px solid ",borderColor:"primary.darker",marginTop:"5px",borderRadius:"5px"},children:[(0,l.jsx)(n.A,{children:(0,l.jsx)(i.A,{})}),(0,l.jsx)(s.A,{primary:e.item,primaryTypographyProps:{fontSize:"18px"}}),(0,l.jsx)(d.A,{edge:"end",children:(0,l.jsx)(c.A,{})})]},e.id)))})})}},8351:(e,t,r)=>{r.d(t,{A:()=>m});var a=r(5043),o=r(5721),n=r(1322),i=r(3851),s=r(6446),d=r(8734),c=r(7392),l=r(4208),p=r(6581),h=r(4109),u=r(9613),g=r(579);const m=e=>{let{uList:t,updateList:r}=e;const{user:m}=(0,a.useContext)(u.c),[A,x]=(0,a.useState)((()=>m.username===t.owner||t.editors.includes(m.username)));return(0,g.jsx)(g.Fragment,{children:(0,g.jsx)(o.A,{children:t.items.map((e=>{return(0,g.jsxs)(n.Ay,{sx:{cursor:"pointer",border:"1px solid ",borderColor:"primary.darker",marginTop:"5px",borderRadius:"5px"},onClick:()=>(e=>{if(A){const a=t.items.map((t=>t.id===e?{...t,itemStatus:"1"===t.itemStatus?"":"1"}:t));r({...t,items:a})}})(e.id),children:[(0,g.jsx)(i.A,{children:(0,g.jsx)(s.A,{children:(a=e.itemStatus,"1"===a?(0,g.jsx)(p.A,{sx:{color:"secondary.main"}}):(0,g.jsx)(h.A,{sx:{color:"secondary.main"}}))})}),(0,g.jsx)(d.A,{primary:e.item,primaryTypographyProps:{fontSize:"18px"}}),(0,g.jsx)(c.A,{edge:"end",children:(0,g.jsx)(l.A,{})})]},e.id);var a}))})})}},5704:(e,t,r)=>{r.d(t,{A:()=>i});r(5043);var a=r(6446),o=r(5865),n=r(579);const i=e=>{let{uList:t}=e;return(0,n.jsx)(n.Fragment,{children:(()=>{if(null!==t.listInfo.listDesc)return(0,n.jsx)(n.Fragment,{children:(0,n.jsx)(a.A,{sx:{marginBottom:1,gridRow:"1",gridColumn:"1 / 2",m:1,paddingLeft:2,paddingRight:2},children:(0,n.jsxs)(o.A,{fontSize:"large",children:[t.listInfo.listDesc,(0,n.jsx)("br",{})]})})})})()})}},9007:(e,t,r)=>{r.d(t,{A:()=>i});var a=r(5865),o=r(6446),n=(r(5043),r(579));const i=e=>{let{title:t}=e;return(0,n.jsx)(n.Fragment,{children:(0,n.jsxs)(o.A,{sx:{paddingTop:2,paddingRight:5,paddingLeft:5},children:[(0,n.jsx)(a.A,{fontSize:"xx-large",sx:{fontFamily:"Garamond",color:"primary.main"},children:(0,n.jsx)("strong",{children:t})}),(0,n.jsx)("br",{})]})})}},7099:(e,t,r)=>{r.r(t),r.d(t,{default:()=>m});var a=r(5043),o=r(835),n=r(6446),i=r(1637),s=r(5865),d=r(6879),c=r(9007),l=r(5704),p=r(8351),h=r(2475),u=r(579);const g=new d.A,m=()=>{const{uuid:e}=(0,o.g)(),[t,r]=(0,a.useState)(!0),[d,m]=(0,a.useState)(null),[A,x]=(0,a.useState)(!1);function y(){}return(0,a.useEffect)((()=>{(async()=>{try{const t=await g.sendGetNoAuth("public/".concat(e));m(t)}catch(t){x(!0)}finally{r(!1)}})()}),[e]),(0,u.jsx)(u.Fragment,{children:(0,u.jsx)(n.A,{maxWidth:750,sx:{mx:"auto"},variant:"contained",children:t?(0,u.jsxs)(n.A,{children:[(0,u.jsx)(i.A,{}),(0,u.jsx)(s.A,{children:"Loading List"})]}):(0,u.jsx)(u.Fragment,{children:A?(0,u.jsx)(s.A,{children:"Unable to load list."}):(0,u.jsxs)(u.Fragment,{children:[(0,u.jsx)(c.A,{title:d.listInfo.listName}),(0,u.jsx)(l.A,{uList:d}),(0,u.jsx)(n.A,{children:(b=d,"CHECK"===b.listInfo.type?(0,u.jsx)(p.A,{uList:d,updateList:y}):(0,u.jsx)(h.A,{uList:d}))})]})})})});var b}},540:(e,t,r)=>{function a(e){return"string"===typeof e}r.d(t,{g:()=>a})},6581:(e,t,r)=>{var a=r(4994);t.A=void 0;var o=a(r(39)),n=r(579);t.A=(0,o.default)((0,n.jsx)("path",{d:"M19 3H5c-1.11 0-2 .9-2 2v14c0 1.1.89 2 2 2h14c1.11 0 2-.9 2-2V5c0-1.1-.89-2-2-2m-9 14-5-5 1.41-1.41L10 14.17l7.59-7.59L19 8z"}),"CheckBox")},4109:(e,t,r)=>{var a=r(4994);t.A=void 0;var o=a(r(39)),n=r(579);t.A=(0,o.default)((0,n.jsx)("path",{d:"M19 5v14H5V5zm0-2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2"}),"CheckBoxOutlineBlank")},7392:(e,t,r)=>{r.d(t,{A:()=>v});var a=r(8587),o=r(8168),n=r(5043),i=r(8387),s=r(8606),d=r(7266),c=r(4535),l=r(8206),p=r(6236),h=r(6803),u=r(7056),g=r(2400);function m(e){return(0,g.Ay)("MuiIconButton",e)}const A=(0,u.A)("MuiIconButton",["root","disabled","colorInherit","colorPrimary","colorSecondary","colorError","colorInfo","colorSuccess","colorWarning","edgeStart","edgeEnd","sizeSmall","sizeMedium","sizeLarge"]);var x=r(579);const y=["edge","children","className","color","disabled","disableFocusRipple","size"],b=(0,c.Ay)(p.A,{name:"MuiIconButton",slot:"Root",overridesResolver:(e,t)=>{const{ownerState:r}=e;return[t.root,"default"!==r.color&&t["color".concat((0,h.A)(r.color))],r.edge&&t["edge".concat((0,h.A)(r.edge))],t["size".concat((0,h.A)(r.size))]]}})((e=>{let{theme:t,ownerState:r}=e;return(0,o.A)({textAlign:"center",flex:"0 0 auto",fontSize:t.typography.pxToRem(24),padding:8,borderRadius:"50%",overflow:"visible",color:(t.vars||t).palette.action.active,transition:t.transitions.create("background-color",{duration:t.transitions.duration.shortest})},!r.disableRipple&&{"&:hover":{backgroundColor:t.vars?"rgba(".concat(t.vars.palette.action.activeChannel," / ").concat(t.vars.palette.action.hoverOpacity,")"):(0,d.X4)(t.palette.action.active,t.palette.action.hoverOpacity),"@media (hover: none)":{backgroundColor:"transparent"}}},"start"===r.edge&&{marginLeft:"small"===r.size?-3:-12},"end"===r.edge&&{marginRight:"small"===r.size?-3:-12})}),(e=>{let{theme:t,ownerState:r}=e;var a;const n=null==(a=(t.vars||t).palette)?void 0:a[r.color];return(0,o.A)({},"inherit"===r.color&&{color:"inherit"},"inherit"!==r.color&&"default"!==r.color&&(0,o.A)({color:null==n?void 0:n.main},!r.disableRipple&&{"&:hover":(0,o.A)({},n&&{backgroundColor:t.vars?"rgba(".concat(n.mainChannel," / ").concat(t.vars.palette.action.hoverOpacity,")"):(0,d.X4)(n.main,t.palette.action.hoverOpacity)},{"@media (hover: none)":{backgroundColor:"transparent"}})}),"small"===r.size&&{padding:5,fontSize:t.typography.pxToRem(18)},"large"===r.size&&{padding:12,fontSize:t.typography.pxToRem(28)},{["&.".concat(A.disabled)]:{backgroundColor:"transparent",color:(t.vars||t).palette.action.disabled}})})),v=n.forwardRef((function(e,t){const r=(0,l.b)({props:e,name:"MuiIconButton"}),{edge:n=!1,children:d,className:c,color:p="default",disabled:u=!1,disableFocusRipple:g=!1,size:A="medium"}=r,v=(0,a.A)(r,y),f=(0,o.A)({},r,{edge:n,color:p,disabled:u,disableFocusRipple:g,size:A}),j=(e=>{const{classes:t,disabled:r,color:a,edge:o,size:n}=e,i={root:["root",r&&"disabled","default"!==a&&"color".concat((0,h.A)(a)),o&&"edge".concat((0,h.A)(o)),"size".concat((0,h.A)(n))]};return(0,s.A)(i,m,t)})(f);return(0,x.jsx)(b,(0,o.A)({className:(0,i.A)(j.root,c),centerRipple:!0,focusRipple:!g,disabled:u,ref:t},v,{ownerState:f,children:d}))}))},5721:(e,t,r)=>{r.d(t,{A:()=>x});var a=r(8587),o=r(8168),n=r(5043),i=r(8387),s=r(8606),d=r(4535),c=r(8206),l=r(1347),p=r(7056),h=r(2400);function u(e){return(0,h.Ay)("MuiList",e)}(0,p.A)("MuiList",["root","padding","dense","subheader"]);var g=r(579);const m=["children","className","component","dense","disablePadding","subheader"],A=(0,d.Ay)("ul",{name:"MuiList",slot:"Root",overridesResolver:(e,t)=>{const{ownerState:r}=e;return[t.root,!r.disablePadding&&t.padding,r.dense&&t.dense,r.subheader&&t.subheader]}})((e=>{let{ownerState:t}=e;return(0,o.A)({listStyle:"none",margin:0,padding:0,position:"relative"},!t.disablePadding&&{paddingTop:8,paddingBottom:8},t.subheader&&{paddingTop:0})})),x=n.forwardRef((function(e,t){const r=(0,c.b)({props:e,name:"MuiList"}),{children:d,className:p,component:h="ul",dense:x=!1,disablePadding:y=!1,subheader:b}=r,v=(0,a.A)(r,m),f=n.useMemo((()=>({dense:x})),[x]),j=(0,o.A)({},r,{component:h,dense:x,disablePadding:y}),w=(e=>{const{classes:t,disablePadding:r,dense:a,subheader:o}=e,n={root:["root",!r&&"padding",a&&"dense",o&&"subheader"]};return(0,s.A)(n,u,t)})(j);return(0,g.jsx)(l.A.Provider,{value:f,children:(0,g.jsxs)(A,(0,o.A)({as:h,className:(0,i.A)(w.root,p),ref:t,ownerState:j},v,{children:[b,d]}))})}))},1347:(e,t,r)=>{r.d(t,{A:()=>a});const a=r(5043).createContext({})},5865:(e,t,r)=>{r.d(t,{A:()=>v});var a=r(8587),o=r(8168),n=r(5043),i=r(8387),s=r(8698),d=r(8606),c=r(4535),l=r(8206),p=r(6803),h=r(7056),u=r(2400);function g(e){return(0,u.Ay)("MuiTypography",e)}(0,h.A)("MuiTypography",["root","h1","h2","h3","h4","h5","h6","subtitle1","subtitle2","body1","body2","inherit","button","caption","overline","alignLeft","alignRight","alignCenter","alignJustify","noWrap","gutterBottom","paragraph"]);var m=r(579);const A=["align","className","component","gutterBottom","noWrap","paragraph","variant","variantMapping"],x=(0,c.Ay)("span",{name:"MuiTypography",slot:"Root",overridesResolver:(e,t)=>{const{ownerState:r}=e;return[t.root,r.variant&&t[r.variant],"inherit"!==r.align&&t["align".concat((0,p.A)(r.align))],r.noWrap&&t.noWrap,r.gutterBottom&&t.gutterBottom,r.paragraph&&t.paragraph]}})((e=>{let{theme:t,ownerState:r}=e;return(0,o.A)({margin:0},"inherit"===r.variant&&{font:"inherit"},"inherit"!==r.variant&&t.typography[r.variant],"inherit"!==r.align&&{textAlign:r.align},r.noWrap&&{overflow:"hidden",textOverflow:"ellipsis",whiteSpace:"nowrap"},r.gutterBottom&&{marginBottom:"0.35em"},r.paragraph&&{marginBottom:16})})),y={h1:"h1",h2:"h2",h3:"h3",h4:"h4",h5:"h5",h6:"h6",subtitle1:"h6",subtitle2:"h6",body1:"p",body2:"p",inherit:"p"},b={primary:"primary.main",textPrimary:"text.primary",secondary:"secondary.main",textSecondary:"text.secondary",error:"error.main"},v=n.forwardRef((function(e,t){const r=(0,l.b)({props:e,name:"MuiTypography"}),n=(e=>b[e]||e)(r.color),c=(0,s.A)((0,o.A)({},r,{color:n})),{align:h="inherit",className:u,component:v,gutterBottom:f=!1,noWrap:j=!1,paragraph:w=!1,variant:S="body1",variantMapping:R=y}=c,z=(0,a.A)(c,A),C=(0,o.A)({},c,{align:h,color:n,className:u,component:v,gutterBottom:f,noWrap:j,paragraph:w,variant:S,variantMapping:R}),T=v||(w?"p":R[S]||y[S])||"span",B=(e=>{const{align:t,gutterBottom:r,noWrap:a,paragraph:o,variant:n,classes:i}=e,s={root:["root",n,"inherit"!==e.align&&"align".concat((0,p.A)(t)),r&&"gutterBottom",a&&"noWrap",o&&"paragraph"]};return(0,d.A)(s,g,i)})(C);return(0,m.jsx)(x,(0,o.A)({as:T,ref:t,ownerState:C,className:(0,i.A)(B.root,u)},z))}))}}]);
//# sourceMappingURL=878.e2b21b9e.chunk.js.map